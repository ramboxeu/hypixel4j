package io.github.ramboxeu.hypixel4j.response;

public class KeyResponse {
    private String key;
    private String owner;
    private int limit;
    private int queriesInPastMin;
    private int totalQueries;

    public String getKey() {
        return key;
    }

    public String getOwner() {
        return owner;
    }

    public int getLimit() {
        return limit;
    }

    public int getQueriesInPastMin() {
        return queriesInPastMin;
    }

    public int getTotalQueries() {
        return totalQueries;
    }

    @Override
    public String toString() {
        return "KeyResponse{" +
                "key='" + key + '\'' +
                ", owner='" + owner + '\'' +
                ", limit=" + limit +
                ", queriesInPastMin=" + queriesInPastMin +
                ", totalQueries=" + totalQueries +
                '}';
    }
}
