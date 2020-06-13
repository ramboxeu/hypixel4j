package io.github.ramboxeu.hypixel4j;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import io.github.ramboxeu.hypixel4j.exception.APIException;
import io.github.ramboxeu.hypixel4j.response.KeyResponse;
import io.github.ramboxeu.hypixel4j.response.skyblock.ProfileResponse;
import io.github.ramboxeu.hypixel4j.response.skyblock.ProfilesResponse;
import javafx.util.Pair;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
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

    public ProfileResponse getSkyblockProfile(String profileId) throws IOException, APIException {
        return get("skyblock/profile", ProfileResponse.class, "profile", new Pair<>("profile", profileId));
    }

    public List<ProfileResponse> getSkyblockProfiles(String playerUuid) throws IOException, APIException {
        return get("skyblock/profiles", new TypeToken<List<ProfileResponse>>(){}.getType(), "profiles", new Pair<>("uuid", playerUuid));
    }

    private <T> T get(String method, Type responseType, String responseObject, Pair<String, String> ...params) throws IOException, APIException {
        HttpUrl.Builder urlBuilder = new HttpUrl.Builder()
                .scheme("https")
                .host(HOST)
                .addPathSegments(method)
                .addQueryParameter("key", this.apiKey.toString());

        for (Pair<String, String> param : params) {
            urlBuilder.addQueryParameter(param.getKey(), param.getValue());
        }

        System.out.println(urlBuilder.build().toString());

        Request request = new Request.Builder().url(urlBuilder.build()).build();

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

            return GSON.fromJson(element, responseType);
        }
    }
}
