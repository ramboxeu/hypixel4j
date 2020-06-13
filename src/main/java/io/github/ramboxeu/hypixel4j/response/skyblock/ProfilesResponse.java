package io.github.ramboxeu.hypixel4j.response.skyblock;

import java.util.List;

public class ProfilesResponse {
    private List<ProfileResponse> profiles;

    public List<ProfileResponse> getProfiles() {
        return profiles;
    }

    @Override
    public String toString() {
        return "ProfilesResponse{" +
                "profiles=" + profiles +
                '}';
    }
}
