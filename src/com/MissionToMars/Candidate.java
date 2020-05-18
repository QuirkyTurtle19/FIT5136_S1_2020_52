package com.MissionToMars;

import java.util.ArrayList;

/**
 * Candidate Class
 *
 * @author Fenghao Qi
 * @version 12 May 2020
 */
public class Candidate
{
    private String candidateId;
    private String candidateName;
    private String candidateDOB;
    private String address;
    private String nationality;
    private String phoneNumber;
    private String identificationType;
    private String gender;
    private String allergies;
    private String foodPreference;
    private String compSkills;
    private ArrayList<String> qualificationList;
    private ArrayList<String> workExpYears;
    private ArrayList<String> occupationList;
    private ArrayList<String> languageList;

    /**
     * Constructor for objects of class Candidate
     */
    public Candidate()
    {
        candidateId = "";
        candidateName = "";
        candidateDOB = "";
        address = "";
        nationality = "";
        phoneNumber = "";
        identificationType = "";
        gender = "";
        allergies = "";
        foodPreference = "";
        qualificationList = new ArrayList<>();
        workExpYears = new ArrayList<>();
        occupationList = new ArrayList<>();
        compSkills = "";
        languageList = new ArrayList<>();
    }

    /**
     * Non-Default constructor for objects of class University
     */
    public Candidate(String candidateId, String candidateName, String candidateDOB, String address, String nationality, String phoneNumber, String identificationType, String gender, String allergies, String foodPreference, ArrayList<String> qualificationList, ArrayList<String> workExpYears, ArrayList<String> occupationList, String compSkills, ArrayList<String> languageList)
    {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateDOB = candidateDOB;
        this.address = address;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.identificationType = identificationType;
        this.gender = gender;
        this.allergies = allergies;
        this.foodPreference = foodPreference;
        this.qualificationList = qualificationList;
        this.workExpYears = workExpYears;
        this.occupationList = occupationList;
        this.compSkills = compSkills;
        this.languageList = languageList;
    }

    public String getCandidateId()
    {
        return candidateId;
    }

    public void setCandidateId(String candidateId)
    {
        this.candidateId = candidateId;
    }

    public String getCandidateName()
    {
        return candidateName;
    }

    public void setCandidateName(String candidateName)
    {
        this.candidateName = candidateName;
    }

    public String getCandidateDOB()
    {
        return candidateDOB;
    }

    public void setCandidateDOB(String candidateDOB)
    {
        this.candidateDOB = candidateDOB;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getAllergies()
    {
        return allergies;
    }

    public void setAllergies(String allergies)
    {
        this.allergies = allergies;
    }

    public String getFoodPreference()
    {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference)
    {
        this.foodPreference = foodPreference;
    }

    public String getCompSkills()
    {
        return compSkills;
    }

    public void setCompSkills(String compSkills)
    {
        this.compSkills = compSkills;
    }

    public ArrayList<String> getQualificationList()
    {
        return qualificationList;
    }

    public void setQualificationList(ArrayList<String> qualificationList)
    {
        this.qualificationList = qualificationList;
    }

    public ArrayList<String> getWorkExpYears()
    {
        return workExpYears;
    }

    public void setWorkExpYears(ArrayList<String> workExpYears)
    {
        this.workExpYears = workExpYears;
    }

    public ArrayList<String> getOccupationList()
    {
        return occupationList;
    }

    public void setOccupationList(ArrayList<String> occupationList)
    {
        this.occupationList = occupationList;
    }

    public ArrayList<String> getLanguageList()
    {
        return languageList;
    }

    public void setLanguageList(ArrayList<String> languageList)
    {
        this.languageList = languageList;
    }
}
