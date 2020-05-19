package com.MissionToMars;

import com.MissionToMars.ListOfCandidates;
import com.MissionToMars.SelectionCriteria;
import com.MissionToMars.SpaceShuttle;


import java.sql.Array;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Mission {
    private String missionId;
    private String missionName;
    private String launchDate;
    private String origin;
    private ArrayList<String> countriesAllowed;
    private Integer missionDuration;
    private String missionType;
    private String missionDesc;
    private String cargoFor;
    private ArrayList<String[]> cargo;
    private String destLocation;
    private String missionStatus;
    private ArrayList<String[]> jobs;
    private ArrayList<String[]> employmentRequirements;
    private SelectionCriteria selectionCriteria;
    private SpaceShuttle spaceShuttle;
    private ListOfCandidates listOfCandidates;
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
        cargoFor = "";
        cargo = new ArrayList<String[]>();
        destLocation = "";
        missionStatus = "";
        jobs = new ArrayList<String[]>();
        employmentRequirements = new ArrayList<String[]>();
        selectionCriteria = new SelectionCriteria();
        spaceShuttle = new SpaceShuttle();
        listOfCandidates = new ListOfCandidates();
    }

    public Mission(String newMissionId, String newMissionName, String newLaunchDate, String newOrigin, ArrayList<String> newCountriesAllowed, Integer newMissionDuration, String newMissionType, String newMissionDescription, String newCargoFor, ArrayList<String[]> newCargo, Integer newCargoQuantityForEach, String newDestLocation, String newMissionStatus, ArrayList<String[]> newJobs, ArrayList<String[]> newEmploymentrequirements, SelectionCriteria newSelectionCriteria, SpaceShuttle newSpaceShuttle, ListOfCandidates newListOfCandidates){
        missionId = newMissionId;
        missionName = newMissionName;
        launchDate = newLaunchDate;
        origin = newOrigin;
        countriesAllowed = newCountriesAllowed;
        missionDuration = newMissionDuration;
        missionType = newMissionType;
        missionDesc = newMissionDescription;
        cargoFor = newCargoFor;
        cargo = newCargo;
        destLocation = newDestLocation;
        missionStatus = newMissionStatus;
        jobs = newJobs;
        employmentRequirements = newEmploymentrequirements;
        selectionCriteria = newSelectionCriteria;
        spaceShuttle = newSpaceShuttle;
        listOfCandidates = newListOfCandidates;

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


    public void setCargoFor(String newCargoFor)
    {
        cargoFor = newCargoFor;
    }

    public String getCargoFor() { return cargoFor; }

    public void setCargoRequired(String cargoRequired) {this.cargoRequired = cargoRequired;}

    public String getCargoRequired()
    {
        return cargoRequired;
    }

    public void setCargoQuantityForEach(Integer cargoQuantityForEach) {
        this.cargoQuantityForEach = cargoQuantityForEach;
    }

    public Integer getCargoQuantityForEach() {
        return cargoQuantityForEach;
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

    public void setListOfCandidates(ListOfCandidates newListOfCandidates)
    {
        this.listOfCandidates=newListOfCandidates;
    }

    public ListOfCandidates getListOfCandidates()
    {
        return listOfCandidates;
    }

    //get specific index
    public Candidate getSpecificCandidate(int index)
    {
        return listOfCandidates.getACandidate(index);
    }



}
