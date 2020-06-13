package io.github.ramboxeu.hypixel4j.skyblock;

import com.google.gson.annotations.SerializedName;

public class Objective {
    private Status status;
    private int progress;

    @SerializedName("completed_at")
    private long dateCompleted;

    public Status getStatus() {
        return status;
    }

    public int getProgress() {
        return progress;
    }

    public long getDateCompleted() {
        return dateCompleted;
    }

    public enum Status {
        ACTIVE,
        COMPLETE
    }

    @Override
    public String toString() {
        return "Objective{" +
                "status=" + status +
                ", progress=" + progress +
                ", dateCompleted=" + dateCompleted +
                '}';
    }
}
