package io.github.ramboxeu.hypixel4j.skyblock;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

public class Member {
    // TODO: Add support for ZonedDateTime
    @SerializedName("last_save")
    private long lastSave;

    @SerializedName("inv_armor")
    private Inventory armorInventory;

    @SerializedName("first_joined")
    private long firstJoined;

    @SerializedName("first_joined_hub")
    private int firstJoinedHub;

    @SerializedName("coop_invitation")
    private CoopInvitation coopInvitation;

    // Change with dedicated class?
    private Map<String, Float> stats;

    // Change with dedicated class?
    private Map<String, Objective> objectives;

    private List<String> tutorial;

    // Change with dedicated class?
    private Map<String, Quest> quests;

    @SerializedName("coin_purse")
    private double balance;

    // TODO: Figure out what time measurement this uses
    @SerializedName("last_death")
    private long lastDeathTime;

    @SerializedName("crafted_generators")
    private List<String> craftedGenerators;

    @SerializedName("visited_zones")
    private List<String> visitedZones;

    @SerializedName("fairy_souls_collected")
    private int fairySoulsCollected;

    @SerializedName("fairy_souls")
    private int fairySouls;

    @SerializedName("fairy_exchanges")
    private int fairyExchanges;

    @SerializedName("death_count")
    private int deaths;

    // TODO: Find complete information and write nice class
    @SerializedName("slayer_bosses")
    private JsonObject slayerBosses;

    private List<Pet> pets;

    @SerializedName("experience_skill_runecrafting")
    private double runeCraftingExperience;

    @SerializedName("experience_skill_combat")
    private double combatExperience;

    @SerializedName("experience_skill_mining")
    private double miningExperience;

    @SerializedName("experience_skill_alchemy")
    private double alchemyExperience;

    @SerializedName("experience_skill_farming")
    private double farmingExperience;

    @SerializedName("experience_skill_taming")
    private double tamingExperience;

    @SerializedName("experience_skill_enchanting")
    private double enchantingExperience;

    @SerializedName("experience_skill_fishing")
    private double fishingExperience;

    @SerializedName("experience_skill_foraging")
    private double foragingExperience;

    @SerializedName("unlocked_coll_tiers")
    private List<String> unlockedCollectionTiers;

    @SerializedName("wardrobe_equipped_slot")
    private int wardrobeEquippedSlot;

    @SerializedName("collection")
    private Map<String, Integer> collections;

    @SerializedName("ender_chest_contents")
    private Inventory enderchest;

    @SerializedName("wardrobe_contents")
    private Inventory wardrobe;

    @SerializedName("inv_contents")
    private Inventory inventory;

    @SerializedName("talisman_bag")
    private Inventory talismanBag;

    // TODO: Replace with dedicated class
    @SerializedName("sacks_counts")
    private JsonObject sacksCounts;

    public long getLastSave() {
        return lastSave;
    }

    public Inventory getArmorInventory() {
        return armorInventory;
    }

    public long getFirstJoined() {
        return firstJoined;
    }

    public int getFirstJoinedHub() {
        return firstJoinedHub;
    }

    public CoopInvitation getCoopInvitation() {
        return coopInvitation;
    }

    public Map<String, Float> getStats() {
        return stats;
    }

    public Map<String, Objective> getObjectives() {
        return objectives;
    }

    public List<String> getTutorial() {
        return tutorial;
    }

    public Map<String, Quest> getQuests() {
        return quests;
    }

    public double getBalance() {
        return balance;
    }

    public long getLastDeathTime() {
        return lastDeathTime;
    }

    public List<String> getCraftedGenerators() {
        return craftedGenerators;
    }

    public List<String> getVisitedZones() {
        return visitedZones;
    }

    public int getFairySoulsCollected() {
        return fairySoulsCollected;
    }

    public int getFairySouls() {
        return fairySouls;
    }

    public int getFairyExchanges() {
        return fairyExchanges;
    }

    public int getDeaths() {
        return deaths;
    }

    public JsonObject getSlayerBosses() {
        return slayerBosses;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public double getRuneCraftingExperience() {
        return runeCraftingExperience;
    }

    public double getCombatExperience() {
        return combatExperience;
    }

    public double getMiningExperience() {
        return miningExperience;
    }

    public double getAlchemyExperience() {
        return alchemyExperience;
    }

    public double getFarmingExperience() {
        return farmingExperience;
    }

    public double getTamingExperience() {
        return tamingExperience;
    }

    public double getEnchantingExperience() {
        return enchantingExperience;
    }

    public double getFishingExperience() {
        return fishingExperience;
    }

    public double getForagingExperience() {
        return foragingExperience;
    }

    public List<String> getUnlockedCollectionTiers() {
        return unlockedCollectionTiers;
    }

    public int getWardrobeEquippedSlot() {
        return wardrobeEquippedSlot;
    }

    public Map<String, Integer> getCollections() {
        return collections;
    }

    public Inventory getEnderchest() {
        return enderchest;
    }

    public Inventory getWardrobe() {
        return wardrobe;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Inventory getTalismanBag() {
        return talismanBag;
    }

    public JsonObject getSacksCounts() {
        return sacksCounts;
    }

    @Override
    public String toString() {
        return "Member{" +
                "lastSave=" + lastSave +
                ", armorInventory=" + armorInventory +
                ", firstJoined=" + firstJoined +
                ", firstJoinedHub=" + firstJoinedHub +
                ", coopInvitation=" + coopInvitation +
                ", stats=" + stats +
                ", objectives=" + objectives +
                ", tutorial=" + tutorial +
                ", quests=" + quests +
                ", balance=" + balance +
                ", lastDeathTime=" + lastDeathTime +
                ", craftedGenerators=" + craftedGenerators +
                ", visitedZones=" + visitedZones +
                ", fairySoulsCollected=" + fairySoulsCollected +
                ", fairySouls=" + fairySouls +
                ", fairyExchanges=" + fairyExchanges +
                ", deaths=" + deaths +
                ", slayerBosses=" + slayerBosses +
                ", pets=" + pets +
                ", runeCraftingExperience=" + runeCraftingExperience +
                ", combatExperience=" + combatExperience +
                ", miningExperience=" + miningExperience +
                ", alchemyExperience=" + alchemyExperience +
                ", farmingExperience=" + farmingExperience +
                ", tamingExperience=" + tamingExperience +
                ", enchantingExperience=" + enchantingExperience +
                ", fishingExperience=" + fishingExperience +
                ", foragingExperience=" + foragingExperience +
                ", unlockedCollectionTiers=" + unlockedCollectionTiers +
                ", wardrobeEquippedSlot=" + wardrobeEquippedSlot +
                ", collections=" + collections +
                ", enderchest=" + enderchest +
                ", wardrobe=" + wardrobe +
                ", inventory=" + inventory +
                ", talismanBag=" + talismanBag +
                ", sacksCounts=" + sacksCounts +
                '}';
    }
}
