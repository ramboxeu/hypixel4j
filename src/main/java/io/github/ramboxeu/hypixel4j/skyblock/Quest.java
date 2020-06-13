package io.github.ramboxeu.hypixel4j.skyblock;

import com.google.gson.annotations.SerializedName;

public class Quest {
    private Status status;

    @SerializedName("activated_at")
    private long dateActivated;

    @SerializedName("activated_at_sb")
    private int skyblockDateActivated;

    @SerializedName("completed_at")
    private long dateCompleted;

    @SerializedName("completed_at_sb")
    private int skyblockDateCompleted;

    public Status getStatus() {
        return status;
    }

    public long getDateActivated() {
        return dateActivated;
    }

    public int getSkyblockDateActivated() {
        return skyblockDateActivated;
    }

    public long getDateCompleted() {
        return dateCompleted;
    }

    public int getSkyblockDateCompleted() {
        return skyblockDateCompleted;
    }

    public enum Status {
        ACTIVE,
        COMPLETE
    }

    @Override
    public String toString() {
        return "Quest{" +
                "status=" + status +
                ", dateActivated=" + dateActivated +
                ", skyblockDateActivated=" + skyblockDateActivated +
                ", dateCompleted=" + dateCompleted +
                ", skyblockDateCompleted=" + skyblockDateCompleted +
                '}';
    }
}
