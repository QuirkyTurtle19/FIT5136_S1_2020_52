package com.MissionToMars;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

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


    public Mission() {

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
                   ArrayList<Candidate> newCandidates, MissionCoordinator newCoordinator) {
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

    public void setMissionId(String newMissionId) {
        missionId = newMissionId;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionName(String newMissionName) {
        missionName = newMissionName;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionDesc(String newMissionDesc) {
        missionDesc = newMissionDesc;
    }

    public String getMissionDesc() {
        return missionDesc;
    }

    public void setCountriesAllowed(ArrayList<String> newCountriesAllowed) {
        this.countriesAllowed = newCountriesAllowed;
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

    public ArrayList<String> getCountriesAllowed() {
        return countriesAllowed;
    }

    //get specific index
    public String getSpecificCountriesAllowed(int index) {
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

    public void setLaunchDate(String newLaunchDate) {
        launchDate = newLaunchDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setDestLocation(String newDestLocation) {
        destLocation = newDestLocation;
    }

    public String getDestLocation() {
        return destLocation;
    }

    public void setMissionDuration(Integer newMissionDuration) {
        missionDuration = newMissionDuration;
    }

    public Integer getMissionDuration() {
        return missionDuration;
    }

    public void setMissionStatus(String newMissionStatus) {
        missionStatus = newMissionStatus;
    }

    public String getMissionStatus() {
        return missionStatus;
    }

    public void setSelectionCriteria(SelectionCriteria newSelectionCriteria) {
        selectionCriteria = newSelectionCriteria;
    }

    public SelectionCriteria getSelectionCriteria() {
        return selectionCriteria;
    }

    public void setSpaceShuttle(SpaceShuttle newSpaceShuttle) {
        spaceShuttle = newSpaceShuttle;
    }

    public SpaceShuttle getSpaceShuttle() {
        return spaceShuttle;
    }

    public void setListOfCandidates(ArrayList<Candidate> newListOfCandidates) {
        this.candidates = newListOfCandidates;
    }

    public ArrayList<Candidate> getListOfCandidates() {
        return candidates;
    }

    //get specific index
    public Candidate getSpecificCandidate(int index) {
        return candidates.get(index);
    }

    public void Criteria() {
        String age = "Age Range";
        String qual = "Qualifications";
        String work = "Years of work experience";
        String occ = "Occupations";
        String health = "Health records";
        String criminal = "Criminal Records";
        String skills = "Computer skills";
        String lang = "Languages spoken";
        Scanner console = new Scanner(System.in);
        Validate va = new Validate();
        boolean choice1 = FALSE,choice2 = FALSE;
        ArrayList<String> display = new ArrayList<>();
        ArrayList<String> selected = new ArrayList<>();
        System.out.println("\n Select criteria that you want for selecting the candidates ");
        System.out.println("=======================================================");
        display.add(age);
        display.add(qual);
        display.add(work);
        display.add(occ);
        display.add(health);
        display.add(criminal);
        display.add(skills);
        display.add(lang);
        displayList(display);
        String Select = "",del = "";
        int opt = 0;
        do {
            System.out.println("\n Enter option: ");
            opt = console.nextInt();
            del=deleteOption(opt, display);
            selected.add(del);
            displayList(display);
            System.out.println(" \n Do you want to continue adding to the list? (y/n): ");
            Select = console.next();
            if(Select.trim().equals("y"))
                choice1 = TRUE;
            else if(Select.trim().equals("n"))
                break;
        } while (display.size() >= 1 && choice1==TRUE);
         // display final selected criteria
        System.out.println("\n Criteria list for selecting candidates \n");
        displayList(selected);
        System.out.println("\n Do you want to make changes to the final Selection Criteria List (y/n)\n ");
        Select = console.next();
        if(Select.trim().equals("y"))
        {
            System.out.println("\n Which edit operation to want to perform on the list: ");
            System.out.println("\n 1. Add Criteria ");
            System.out.println("\n 2. Remove Criteria ");
            opt = console.nextInt();
            if(opt==1)
            {
                System.out.println("\n Enter option to add from the list: ");
                do {
                    displayList(display);
                    System.out.println("\n Enter option: ");
                    opt = console.nextInt();
                    del=deleteOption(opt, display);
                    selected.add(del);
                    displayList(selected);
                    System.out.println(" \n Do you want to continue adding to the list? (y/n): ");
                    Select = console.next();
                    if(Select.trim().equals("y"))
                        choice1 = TRUE;
                    else if(Select.trim().equals("n"))
                        break;
                } while (display.size() >= 1 && choice1==TRUE);
            }
            else if(opt==2)
            {
                System.out.println("\n Enter option to remove from the list: ");
                do{
                    displayList(selected);
                    System.out.println("Enter option: ");
                    opt=console.nextInt();
                    del=deleteOption(opt,selected);
                    display.add(del);
                    System.out.println(" \n Do you want to continue removing from the options list? (y/n): ");
                    Select = console.next();
                    if(Select.trim().equals("y"))
                        choice2 = TRUE;
                    else if(Select.trim().equals("n"))
                        break;
                }while(selected.size() >=1 && choice2 == TRUE);
            }
            else System.out.println("Please enter a valid option");

        }

        System.out.println("\n ________ FINAL SELECTION CRITERIA ________ \n");
        displayList(selected);
        for (int i = 0; i < selected.size(); i++)
        {
            setValues(selected.get(i));
        }
    }

    public String deleteOption(int option, ArrayList<String> display) {
        String delete="";
        for (int i = 0; i <= display.size(); i++) {
            if (option == (i)) {
               delete= display.remove(i - 1);
            }
        }
        return delete;
    }

    public void displayList(ArrayList<String> display) {
        for (int i = 0; i < display.size(); i++) {
            System.out.println(i + 1 + "." + display.get(i));
        }

    }

    public void setValues(String option)
    {
        SelectionCriteria criteria = new SelectionCriteria();
        switch(option)
        {
            case "Age Range" : {
                criteria.askAge();
                setSelectionCriteria(criteria);
            }
            break;
            case "Qualifications" : {
                criteria.askQualifications();
            }
            break;
            case "Years of work experience" : {
                criteria.askExperience();
            }
            break;
            case "Occupations" : {
                criteria.askOccupation();
            }
            break;
            case "Health Records" : {
                criteria.askHealthRecord();
            }
            break;
            case "Criminal Records" : {
                criteria.askCriminalRecord();
            }
            break;
            case "Computer skills" : {
                criteria.askComputerSkill();
            }
            break;
            case "Languages spoken" : {
                criteria.askLanguageRequired();
            }
            break;
            default: {
                System.out.println("Invalid Numbers entered");
            }
            break;

        }
    }
}
