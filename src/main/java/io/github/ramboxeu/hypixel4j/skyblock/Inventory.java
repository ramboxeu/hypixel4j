package io.github.ramboxeu.hypixel4j.skyblock;

public class Inventory {
    private int type;
    private String data; // base64 string

    public int getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
