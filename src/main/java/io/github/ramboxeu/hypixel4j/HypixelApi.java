package io.github.ramboxeu.hypixel4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.ramboxeu.hypixel4j.exception.APIException;
import io.github.ramboxeu.hypixel4j.response.KeyResponse;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.UUID;

public class HypixelApi {
    private final UUID apiKey;
    private final OkHttpClient httpClient;

    private static final Gson GSON = new GsonBuilder().create();
    private static final String HOST = "api.hypixel.net";

    public HypixelApi(UUID apiKey) {
        this.apiKey = apiKey;
        this.httpClient = new OkHttpClient();
    }

    public HypixelApi(String apiKey) {
        this(UUID.fromString(apiKey));
    }

    public KeyResponse getKeyInfo() throws IOException, APIException {
        return get("key", KeyResponse.class, "record");
    }

    private <T> T get(String method, Class<T> responseClass, String responseObject) throws IOException, APIException {
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host(HOST)
                .addPathSegment(method)
                .addQueryParameter("key", this.apiKey.toString())
                .build();

        Request request = new Request.Builder().url(url).build();

        try(Response response = httpClient.newCall(request).execute()) {
            System.out.println(response.code());

            JsonObject object = GSON.fromJson(response.body().charStream(), JsonObject.class);

            System.out.println(object.toString());

            if (!object.get("success").getAsBoolean()) {
                throw new APIException(String.format("Request failed: %s", object.get("cause").getAsString()));
            }

            JsonElement element = object.get(responseObject);
            if (element.isJsonNull()) {
                throw new APIException("Element '" + responseObject + "' is null");
            }

            return GSON.fromJson(element, responseClass);
        }
    }
}
