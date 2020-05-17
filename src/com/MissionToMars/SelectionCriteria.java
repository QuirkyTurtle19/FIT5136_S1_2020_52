package com.MissionToMars;

import java.util.ArrayList;

public class SelectionCriteria {

    private int minimumAge;
    private int maximumAge;
    private String qualification;
    private int workExperience;
    private String occupation;
    private ArrayList<String> healthRecord;
    private ArrayList<String> criminalRecord;
    private String computerSkill;
    private String languageRequired;
    private ArrayList<String> secondaryLanguages;

    public SelectionCriteria(){
        minimumAge = 0;
        maximumAge = 100;
        qualification = "";
        workExperience = 0;
        occupation = "";
        healthRecord = new ArrayList<>();
        criminalRecord = new ArrayList<>();
        computerSkill = "";
    }

    public SelectionCriteria(int min, int max, String quals, int experience, String newComputerSkill){
        maximumAge = min;
        maximumAge = max;
        qualification = quals;
        workExperience = experience;
        computerSkill = newComputerSkill;
        languageRequired = "English";
        secondaryLanguages = new ArrayList<>();
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public String getQualification() {
        return qualification;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getOccupation() {
        return occupation;
    }

    public ArrayList<String> getHealthRecord() {
        return healthRecord;
    }

    public ArrayList<String> getCriminalRecord() {
        return criminalRecord;
    }

    public String getComputerSkill() {
        return computerSkill;
    }

    public String getLanguageRequired() {
        return languageRequired;
    }

    public ArrayList<String> getSecondaryLanguages() {
        return secondaryLanguages;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setComputerSkill(String computerSkill) {
        this.computerSkill = computerSkill;
    }

    public void setLanguageRequired(String languageRequired) {
        this.languageRequired = languageRequired;
    }

    public void setSecondaryLanguages(ArrayList<String> secondaryLanguages) {
        this.secondaryLanguages = secondaryLanguages;
    }
}
