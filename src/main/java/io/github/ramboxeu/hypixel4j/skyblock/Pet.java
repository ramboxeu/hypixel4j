package io.github.ramboxeu.hypixel4j.skyblock;

import com.google.gson.annotations.SerializedName;

public class Pet {
    private String type; // enum?

    @SerializedName("exp")
    private float experience;

    private boolean active;
    private String tier; // enum?
    private String heldItem;
    private int candyUsed;

    public String getType() {
        return type;
    }

    public float getExperience() {
        return experience;
    }

    public boolean isActive() {
        return active;
    }

    public String getTier() {
        return tier;
    }

    public String getHeldItem() {
        return heldItem;
    }

    public int getCandyUsed() {
        return candyUsed;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", experience=" + experience +
                ", active=" + active +
                ", tier='" + tier + '\'' +
                ", heldItem='" + heldItem + '\'' +
                ", candyUsed=" + candyUsed +
                '}';
    }
}
