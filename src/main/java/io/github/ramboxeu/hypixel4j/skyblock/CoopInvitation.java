package io.github.ramboxeu.hypixel4j.skyblock;

import com.google.gson.annotations.SerializedName;

public class CoopInvitation {
    @SerializedName("timestamp")
    private long dateCreated;

    @SerializedName("invited_by")
    private String invitedBy;

    private boolean confirmed;

    @SerializedName("confirmed_timestamp")
    private long dateConfirmed;

    public long getDateCreated() {
        return dateCreated;
    }

    public String getInvitedBy() {
        return invitedBy;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public long getDateConfirmed() {
        return dateConfirmed;
    }

    @Override
    public String toString() {
        return "CoopInvitation{" +
                "dateCreated=" + dateCreated +
                ", invitedBy='" + invitedBy + '\'' +
                ", confirmed=" + confirmed +
                ", dateConfirmed=" + dateConfirmed +
                '}';
    }
}
