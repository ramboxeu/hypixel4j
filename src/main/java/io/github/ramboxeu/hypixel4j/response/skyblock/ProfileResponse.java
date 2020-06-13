package io.github.ramboxeu.hypixel4j.response.skyblock;

import com.google.gson.annotations.SerializedName;
import io.github.ramboxeu.hypixel4j.skyblock.Member;

import java.util.Map;

public class ProfileResponse {
    @SerializedName("profile_id")
    private String profileId;
    private Map<String, Member> members;
    @SerializedName("cute_name")
    private String cuteName;

    public String getProfileId() {
        return profileId;
    }

    public Map<String, Member> getMembers() {
        return members;
    }

    public String getCuteName() {
        return cuteName;
    }

    @Override
    public String toString() {
        return "ProfileResponse{" +
                "profileId='" + profileId + '\'' +
                ", members=" + members +
                '}';
    }
}
