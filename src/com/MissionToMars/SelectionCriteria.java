package com.MissionToMars;

import java.util.*;
import java.io.*;
import java.lang.*;

import static java.lang.Boolean.TRUE;

public class SelectionCriteria {

    private Integer minimumAge;
    private Integer maximumAge;
    private String qualification;
    private Integer workExperience;
    private String occupation;
    private ArrayList<String> healthRecord;
    private ArrayList<String> criminalRecord;
    private String computerSkill;
    private String languageRequired;
    private ArrayList<String> secondaryLanguages;
    private FileIO  reader;
    Validate validate = new Validate();
    public SelectionCriteria(){
        minimumAge = null;
        maximumAge = null;
        qualification = null;
        workExperience = null;
        occupation = null;
        healthRecord = null;
        criminalRecord = null;
        languageRequired= null;
        computerSkill = null;
    }

    public SelectionCriteria(Integer min, Integer max, Integer experience, String quals, String newOccupation, String newComputerSkill, String newLanguageRequired, ArrayList<String> newSecondaryLanguage){
        maximumAge = min;
        maximumAge = max;
        qualification = quals;
        occupation = newOccupation;
        workExperience = experience;
        computerSkill = newComputerSkill;
        languageRequired = newLanguageRequired;
        secondaryLanguages = newSecondaryLanguage;
        healthRecord = null;
        criminalRecord = null;
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

    public void setHealthRecord(ArrayList<String> healthRecord) {
        this.healthRecord = healthRecord;
    }

    public void setCriminalRecord(ArrayList<String> criminalRecord) {
        this.criminalRecord = criminalRecord;
    }

    public void setSecondaryLanguages(ArrayList<String> secondaryLanguages) {
        this.secondaryLanguages = secondaryLanguages;
    }

    public void importSelectionCriteria(int index){

        reader = new FileIO();

        String selectionCriteriaString = reader.readFile("selectionCriteria");
        String[] selectionCriteriaArray = selectionCriteriaString.split("\n");

        String[] singleSelectionCriteriaArray = selectionCriteriaArray[index].split(";");

        String[] secondaryLanguageArray = singleSelectionCriteriaArray[9].split(",");
        ArrayList<String> secondLanguages = new ArrayList<>();

        if (secondaryLanguageArray.length > 1){
            int i = 0;
            while (secondaryLanguageArray.length > i){
                secondLanguages.add(secondaryLanguageArray[i]);
                i++;
            }
        }else{
            secondLanguages.add(singleSelectionCriteriaArray[9]);
        }


    }

    public void askAge()
    {
        int min,max;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Minimum Age : ");
        min=console.nextInt();
        setMinimumAge(min);
        System.out.println("Enter Maximum Age : ");
        max=console.nextInt();
        setMaximumAge(max);
    }

    public void askQualifications()
    {
        String qualifications;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Qualifications Required:");
        qualifications=console.nextLine();
        setQualification(qualifications);
    }

    public void askExperience()
    {
        int we;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Experience Required:");
        we=console.nextInt();
        setWorkExperience(we);
    }

    public void askOccupation()
    {
        String occ;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Occupations Done:");
        occ=console.nextLine();
        setOccupation(occ);
    }

    public void askHealthRecord()
    {
        String input,choice,str1;
        Scanner console = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter Health Requirements:");
        System.out.println("Note : Enter Atleast One Requirement");
        input=console.nextLine();
        str.add(input);
        System.out.println("Do You want to add more ?");
        System.out.println("Press y/n");
        choice=console.nextLine();
        if(choice.trim().equals("y")==TRUE)
        {
            while (choice.trim().equals("y")==TRUE)
            {
                System.out.println("Enter Requirement");
                str1 = console.nextLine();
                str.add(str1);
                System.out.println("Do You want to add more ?");
                System.out.println("Press y/n");
                choice = console.nextLine();
            }
        }
        else
            System.out.println("Health Updated");
        setHealthRecord(str);
    }

    public void askCriminalRecord()
    {
        String input,choice,str1;
        Scanner console = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter Criminal Record Requirements:");
        System.out.println("Note : Enter At least One Requirement");
        input=console.nextLine();
        str.add(input);
        System.out.println("Do You want to add more ?");
        System.out.println("Press y/n");
        choice=console.nextLine();
        if(choice.trim().equals("y")==TRUE)
        {
            while (choice.trim() .equals("y")==TRUE)
            {
                System.out.println("Enter Requirement");
                str1 = console.nextLine();
                str.add(str1);
                System.out.println("Do You want to add more ?");
                System.out.println("Press y/n");
                choice = console.nextLine();
            }
        }
        else
            System.out.println("Criminal record Updated");

        setCriminalRecord(str);

    }

    public void askComputerSkill()
    {
        String skill;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Skill:");
        skill =console.nextLine();
        setComputerSkill(skill);
    }

    public void askLanguageRequired()
    {
        String lang;
        Scanner console = new Scanner(System.in);
        System.out.println("Enter language Required:");
        lang =console.nextLine();
        setLanguageRequired(lang);
    }

    public void askSecondaryLanguages()
    {
        String input,choice,str1;
        Scanner console = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        System.out.println("Enter Secondary language Requirements:");
        System.out.println("Note : Enter Atleast One Requirement");
        input=console.nextLine();
        str.add(input);
        System.out.println("Do You want to add more ?");
        System.out.println("Press y/n");
        choice=console.nextLine();
        if(choice.trim().equals("y")==TRUE)
        {
            while (choice.trim().equals("y")==TRUE)
            {
                System.out.println("Enter Language");
                str1 = console.nextLine();
                str.add(str1);
                System.out.println("Do You want to add more ?");
                System.out.println("Press y/n");
                choice = console.nextLine();
            }
        }
        else
            System.out.println("Secondary languages Updated");

        setSecondaryLanguages(str);

    }

    public static void main(String[] args)
    {
        SelectionCriteria st = new SelectionCriteria();

    }

}
