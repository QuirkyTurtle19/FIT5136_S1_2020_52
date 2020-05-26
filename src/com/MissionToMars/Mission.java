package com.MissionToMars;


import com.MissionToMars.SelectionCriteria;
import com.MissionToMars.SpaceShuttle;


import java.awt.*;
import java.sql.Array;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Mission {
    private String missionId;
    private String missionName;
    private String launchDate;
    private String origin;
    private ArrayList<String> countriesAllowed;
    private Integer missionDuration;
    private String missionType;
    private String missionDesc;
    private ArrayList<Stock> journeyCargo;
    private ArrayList<Stock> missionCargo;
    private ArrayList<Stock> otherMissionCargo;
    private String destLocation;
    private String missionStatus;
    private ArrayList<String[]> jobs;
    private ArrayList<String[]> employmentRequirements;
    private SelectionCriteria selectionCriteria;
    private SpaceShuttle spaceShuttle;
    private ArrayList<Candidate> candidates;
    private MissionCoordinator coordinator;
    private FileIO reader;

    public Mission(){

        missionId = "";
        missionName = "";
        launchDate = "01-01-2020";
        origin = "";
        countriesAllowed = new ArrayList<>();
        missionDuration = 0;
        missionType = "String";
        missionDesc = "";
        journeyCargo = new ArrayList<Stock>();
        missionCargo = new ArrayList<Stock>();
        otherMissionCargo = new ArrayList<Stock>();
        destLocation = "";
        missionStatus = "";
        jobs = new ArrayList<String[]>();
        employmentRequirements = new ArrayList<String[]>();
        selectionCriteria = new SelectionCriteria();
        spaceShuttle = new SpaceShuttle();
        candidates = new ArrayList<Candidate>();
        coordinator = new MissionCoordinator();
    }

    public Mission(String newMissionId, String newMissionName, String newLaunchDate, String newOrigin,
                   ArrayList<String> newCountriesAllowed, Integer newMissionDuration, String newMissionType,
                   String newMissionDescription, ArrayList<Stock> newJourneyCargo, ArrayList<Stock> newMissionCargo,
                   ArrayList<Stock> newOtherMissionCargo, String newDestLocation, String newMissionStatus,
                   ArrayList<String[]> newJobs, ArrayList<String[]> newEmploymentrequirements,
                   SelectionCriteria newSelectionCriteria, SpaceShuttle newSpaceShuttle,
                   ArrayList<Candidate> newCandidates, MissionCoordinator newCoordinator){
        missionId = newMissionId;
        missionName = newMissionName;
        launchDate = newLaunchDate;
        origin = newOrigin;
        countriesAllowed = newCountriesAllowed;
        missionDuration = newMissionDuration;
        missionType = newMissionType;
        missionDesc = newMissionDescription;
        journeyCargo = newJourneyCargo;
        missionCargo = newMissionCargo;
        otherMissionCargo = newOtherMissionCargo;
        destLocation = newDestLocation;
        missionStatus = newMissionStatus;
        jobs = newJobs;
        employmentRequirements = newEmploymentrequirements;
        selectionCriteria = newSelectionCriteria;
        spaceShuttle = newSpaceShuttle;
        candidates = newCandidates;
        coordinator = newCoordinator;

    }

    public void setMissionId(String newMissionId)
    {
        missionId = newMissionId;
    }

    public String getMissionId()
    {
        return missionId;
    }

    public void setMissionName(String newMissionName)
    {
        missionName = newMissionName;
    }

    public String getMissionName()
    {
        return missionName;
    }

    public void setMissionDesc(String newMissionDesc)
    {
        missionDesc= newMissionDesc;
    }
    public String getMissionDesc()
    {
        return missionDesc;
    }

    public void setCountriesAllowed(ArrayList<String> newCountriesAllowed)
    {
        this.countriesAllowed=newCountriesAllowed;
    }

    public String getMissionType() {
        return missionType;
    }

    public void setMissionType(String missionType) {
        this.missionType = missionType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<String> getCountriesAllowed()
    {
        return countriesAllowed;
    }

    //get specific index
    public String getSpecificCountriesAllowed(int index)
    {
        return countriesAllowed.get(index);
    }


    public ArrayList<Stock> getJourneyCargo() {
        return journeyCargo;
    }

    public void setJourneyCargo(ArrayList<Stock> journeyCargo) {
        this.journeyCargo = journeyCargo;
    }

    public ArrayList<Stock> getMissionCargo() {
        return missionCargo;
    }

    public void setMissionCargo(ArrayList<Stock> missionCargo) {
        this.missionCargo = missionCargo;
    }

    public ArrayList<Stock> getOtherMissionCargo() {
        return otherMissionCargo;
    }

    public void setOtherMissionCargo(ArrayList<Stock> otherMissionCargo) {
        this.otherMissionCargo = otherMissionCargo;
    }

    public ArrayList<String[]> getEmploymentRequirements() {
        return employmentRequirements;
    }

    public void setEmploymentRequirements(ArrayList<String[]> employmentRequirements) {
        this.employmentRequirements = employmentRequirements;
    }

    public ArrayList<String[]> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<String[]> jobs) {
        this.jobs = jobs;
    }

    public MissionCoordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(MissionCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public void setLaunchDate(String newLaunchDate)
    {
        launchDate=newLaunchDate;
    }

    public String getLaunchDate()
    {
        return launchDate;
    }

    public void setDestLocation(String newDestLocation)
    {
        destLocation=newDestLocation;
    }

    public String getDestLocation()
    {
        return destLocation;
    }

    public void setMissionDuration(Integer newMissionDuration)
    {
        missionDuration=newMissionDuration;
    }

    public Integer getMissionDuration()
    {
        return missionDuration;
    }

    public void setMissionStatus(String newMissionStatus)
    {
        missionStatus=newMissionStatus;
    }

    public String getMissionStatus()
    {
        return missionStatus;
    }

    public void setSelectionCriteria(SelectionCriteria newSelectionCriteria)
    {
        selectionCriteria=newSelectionCriteria;
    }

    public SelectionCriteria  getSelectionCriteria()
    {
        return selectionCriteria;
    }

    public void setSpaceShuttle(SpaceShuttle newSpaceShuttle)
    {
        spaceShuttle=newSpaceShuttle;
    }

    public SpaceShuttle getSpaceShuttle()
    {
        return spaceShuttle;
    }

    public void setListOfCandidates(ArrayList<Candidate> newListOfCandidates)
    {
        this.candidates=newListOfCandidates;
    }

    public ArrayList<Candidate> getListOfCandidates()
    {
        return candidates;
    }

    //get specific index
    public Candidate getSpecificCandidate(int index)
    {
        return candidates.get(index);
    }

}
