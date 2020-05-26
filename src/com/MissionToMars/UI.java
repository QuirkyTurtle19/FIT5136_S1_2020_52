package com.MissionToMars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UI
{
    public UI()
    {

    }

    public void createMission()
    {
        Validate va = new Validate();

        String mId = va.acceptStringInput("Please Enter Mission ID: ");
        String mName = va.acceptStringInput("Please Enter Mission Name: ");
        String mDesc = va.acceptStringInput("Please Enter Mission Description: ");
        String mType = va.acceptStringInput("Please Enter Mission Type: ");
        String origin = va.acceptStringInput("Please Enter Country of origin: ");
        ArrayList<String> countries = inputCountriesAllowed();
        String date = va.acceptStringInput("Please Enter the Launch Date: ");
        String destLocation = va.acceptStringInput("Please Enter the Destination Location: ");
        int duration = va.acceptIntegerInput("Please Enter Mission Duration:");
        String mStatus = selectMissionStatus();
        ArrayList<String[]> jobs = inputJobs();
        ArrayList<String[]> requirements = inputRequirements();
        MissionCoordinator coordinator = new MissionCoordinator();

        //Method for create Selection Criteria here


//        Mission newMission = new Mission(mId, mName, date, origin, countries, duration, mType, mDesc,
//                ArrayList < Stock > newJourneyCargo, ArrayList < Stock > newMissionCargo,
//                ArrayList < Stock > newOtherMissionCargo, destLocation, mStatus, jobs, requirements,
//                SelectionCriteria newSelectionCriteria, SpaceShuttle newSpaceShuttle,
//                ArrayList < Candidate > newCandidates, MissionCoordinator newCoordinator);

        //return newMission;
        //newMission.setMissionId(mId);
    }


    public ArrayList<String> inputCountriesAllowed()
    {
        Validate va = new Validate();
        boolean flag = true;
        ArrayList<String> countryList = new ArrayList<>();

        while (flag)
        {
            System.out.println("Note : Enter at least one country a time.");
            String country = va.acceptStringInput("Please Enter Countries allowed: ");
            if (countryList.size() > 0 && country.equals(countryList.get(countryList.size() - 1)))
            {
                System.out.println(country + " already exist! Please Enter another Countries allowed: ");
                continue;
            }
            countryList.add(country);
            System.out.println("Note : Enter y for YES and n for NO.");
            String choice = va.acceptStringInput("Do You want to add more ? Enter y/n");
            if (choice.trim().equals("n"))
            {
                flag = false;
                System.out.println("Countries allowed added" + countryList);
            }
        }
        return countryList;
    }

    public String selectMissionStatus()
    {
        String statusSelect = "Planning phase";
        Validate va = new Validate();
        ArrayList<String> status = new ArrayList<>(Arrays.asList("Planning phase", "Departed Earth", "Landed on Mars",
                "Mission in progress", "Returned to Earth", "Mission completed"));
        System.out.println("Please select status from the following options");
        System.out.println("1. Planning phase");
        System.out.println("2. Departed Earth");
        System.out.println("3. Landed on Mars");
        System.out.println("4. Mission in progress");
        System.out.println("5. Returned to Earth");
        System.out.println("6. Mission completed");
        int input = va.acceptIntegerInput("");
        switch (input)
        {
            case 1:
                statusSelect = status.get(0);
                break;
            case 2:
                statusSelect = status.get(1);
                break;
            case 3:
                statusSelect = status.get(2);
                break;
            case 4:
                statusSelect = status.get(3);
                break;
            case 5:
                statusSelect = status.get(4);
                break;
            case 6:
                statusSelect = status.get(5);
        }
        System.out.println("Status of the mission is " + statusSelect);
        return statusSelect;
    }

    public ArrayList<String[]> inputJobs()
    {
        ArrayList<String[]> jobs = new ArrayList<>();
        Validate va = new Validate();
        boolean flag = true;
        while (flag)
        {
            System.out.println("Note : Enter at least one job name a time.");
            String jobName = va.acceptStringInput("Please Enter the Job Name: ");
            String jobDesc = va.acceptStringInput("Please Enter the Job Description: ");
            String[] job = new String[]{jobName, jobDesc};
            jobs.add(job);
            System.out.println("Note : Enter y for YES and n for NO.");
            String choice = va.acceptStringInput("Do You want to add another Job? Enter y/n");
            if (choice.trim().equals("n"))
            {
                flag = false;
                System.out.println("Jobs added");
                //System.out.println(Arrays.toString(jobs.get(jobs.size() - 1)));
            }
        }
        return jobs;
    }

    public ArrayList<String[]> inputRequirements()
    {
        ArrayList<String[]> requirements = new ArrayList<>();
        Validate va = new Validate();
        boolean flag = true;
        while (flag)
        {
            System.out.println("Note : Enter at least one Employment Title a time.");
            String reTitle = va.acceptStringInput("Please Enter the Employment Title: ");
            String reNum = va.acceptStringInput("Please Enter the Number of Employees Required: ");
            String[] re = new String[]{reTitle, reNum};
            requirements.add(re);
            System.out.println("Note : Enter y for YES and n for NO.");
            String choice = va.acceptStringInput("Do You want to add another " +
                    "Employment requirement? Enter y/n");
            if (choice.trim().equals("n"))
            {
                flag = false;
                System.out.println("Employment requirements added");
                //System.out.println(Arrays.toString(requirements.get(requirements.size() - 1)));
            }
        }
        return requirements;
    }

//    public MissionCoordinator inputCoordinator()
//    {
//        MissionCoordinator coordinator = new MissionCoordinator();
//    }


}
