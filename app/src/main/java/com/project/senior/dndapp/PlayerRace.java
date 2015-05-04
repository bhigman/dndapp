package com.project.senior.dndapp;

import android.util.Log;

/**
 * Abstract race for other races to be built on
 * Created by Ben on 5/3/2015.
 */
public class PlayerRace {

    public static final String TAG = "DnDApp";
    private String name;
    private String subrace;
    private String ageRange;
    private String[] statBonuses;
    private String alignments;
    private String sizeRange;
    private String[] benefits;
    private String[] languages;
    private int speed;

    //Constructor
    public PlayerRace(String name){
        this.name = name;
        this.subrace = "";

        switch(this.name){
            case "Dwarf":
                this.ageRange = "50-300";
                this.alignments = "Mostly Lawful, tend towards good.";
                this.sizeRange = "4-5";
                this.speed = 25;
                this.statBonuses = new String[]{"0,0,2,0,1,0","2,0,2,0,0,0"};
                this.benefits = new String[]{"Wise and Tough: +1 to Wisdom and +1 to max HP every level.",
                        "Strong and Hearty: +2 to Strength and gain proficiency with light and medium armor.",
                        "Darkvision: You can see in in dim light as if it were bright light for 60 feet and in darkness as if it were dim light.",
                        "Dwarven Resilience: Advantage on saving throws against poison and resistence to poison damage.",
                        "Dwarven Combat Training: proficiency with the battleaxe, handaxe, throwing hammer, and warhammer",
                        "Tool Proficiency: smith's tools, brewer's supplies, or mason's tools",
                        "Stonecunning: Add double proficiency bonus to History checks regarding stonework."};
                this.languages = new String[]{"Dwarvish", "Common"};
                break;

            case "Elf":
                this.ageRange = "20-700";
                this.alignments = "Chaotic leaning and generally good, aside from the Drow";
                this.sizeRange = "5-7";
                this.speed = 30;
                this.statBonuses = new String[]{"0,2,0,1,0,0","0,0,0,0,1,0","0,0,0,0,0,1"};
                this.benefits = new String[]{
                        "Darkvision: You can see in in dim light as if it were bright light for 60 feet and in darkness as if it were dim light.",
                        "Keen Senses: Proficient in perception.",
                        "Fey Ancestry: Advantage on charm saving throws, and cannot be magically put to sleep.",
                        "Trance: Elves meditate for 4 hours to long rest instead of the normal 8 hours."
                };
                this.languages = new String[]{"Common","Elvish"};
                break;
            default:
                Log.i(TAG, "Incorrect class string");
        }
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAgeRange(String ageRAnge) {
        this.ageRange = ageRAnge;
    }

    public void setStatBonuses(String[] statBonuses) {
        this.statBonuses = statBonuses;
    }

    public void setAlignments(String alignments) {
        this.alignments = alignments;
    }

    public void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }

    public void setBenefits(String[] benefits) {
        this.benefits = benefits;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public String[] getStatBonuses() {
        return statBonuses;
    }

    public String getAlignments() {
        return alignments;
    }

    public String getSizeRange() {
        return sizeRange;
    }

    public String[] getBenefits() {
        return benefits;
    }

    public String getSubrace() {
        return subrace;
    }

    public String[] getLanguages() {
        return languages;
    }

    public int getSpeed() {
        return speed;
    }

    //To String
    public String toString(){
        return this.name;
    }
}
