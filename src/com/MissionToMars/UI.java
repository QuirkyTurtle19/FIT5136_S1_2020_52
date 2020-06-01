package com.MissionToMars;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UI
{
    public UI()
    {

    }

    public void createMission(Mission mission)
    {
        Validate va = new Validate();
        System.out.println("Space shuttle " + mission.getSpaceShuttle().getShuttleName() + "is selected to start the mission");
        //get user's input
        String mId = va.acceptStringInput("Please Enter Mission ID: ");
        mission.setMissionId(mId);
        String mName = va.acceptStringInput("Please Enter Mission Name: ");
        mission.setMissionName(mName);
        String mDesc = va.acceptStringInput("Please Enter Mission Description: ");
        mission.setMissionDesc(mDesc);
        String mType = va.acceptStringInput("Please Enter Mission Type: ");
        mission.setMissionType(mType);
        String origin = va.acceptStringInput("Please Enter Country of origin: ");
        mission.setOrigin(origin);
        ArrayList<String> countries = inputCountriesAllowed();
        mission.setCountriesAllowed(countries);
        String date = va.acceptStringInput("Please Enter the Launch Date: ");
        mission.setLaunchDate(date);
        String destLocation = va.acceptStringInput("Please Enter the Destination Location: ");
        mission.setDestLocation(destLocation);
        int duration = va.acceptIntegerInput("Please Enter Mission Duration:");
        mission.setMissionDuration(duration);
        String mStatus = selectMissionStatus();
        mission.setMissionStatus(mStatus);
        ArrayList<String[]> jobs = inputJobs();
        mission.setJobs(jobs);
        ArrayList<String[]> requirements = inputRequirements();
        mission.setEmploymentRequirements(requirements);
        MissionCoordinator coordinator = inputCoordinator();
        mission.setCoordinator(coordinator);

        //cargo requirements
        ArrayList<ArrayList<String>> cargo = cargoRequirements();
        ArrayList<Stock> stockList = new ArrayList<>();

        ArrayList < String > newJourneyCargo = cargo.get(0);
        for(int i = 0; i < newJourneyCargo.size(); i++)
        {
            Stock stock = new Stock();
            stock.setName(newJourneyCargo.get(i));
            stockList.add(stock);
        }
        ArrayList < String > newMissionCargo = cargo.get(1);
        for(int i = 0; i < newMissionCargo.size(); i++)
        {
            Stock stock = new Stock();
            stock.setName(newMissionCargo.get(i));
            stockList.add(stock);
        }
        ArrayList < String > newOtherCargo = cargo.get(2);
        for(int i = 0; i < newOtherCargo.size(); i++)
        {
            Stock stock = new Stock();
            stock.setName(newOtherCargo.get(i));
            stockList.add(stock);
        }
        mission.setJourneyCargo(stockList);

        //Method for create Selection Criteria here
        SelectionCriteria newSelectionCriteria = new SelectionCriteria();

        ArrayList < Candidate > newCandidates = new ArrayList<>();

//        new Mission(mId, mName, date, origin, countries, duration, mType, mDesc,
//                newJourneyCargo, newMissionCargo, newOtherMissionCargo, destLocation, mStatus, jobs, requirements,
//                newSelectionCriteria, newSpaceShuttle, newCandidates, coordinator);

        displayMission(mission);
    }

    public void displayMission(Mission mission)
    {

        System.out.println("Mission Created!");
        System.out.println("1.Mission ID: " + mission.getMissionId());
        System.out.println("2.Mission Name: " + mission.getMissionName());
        System.out.println("3.Country of origin: " + mission.getOrigin());
        System.out.println("4.Countries allowed: " + mission.getCountriesAllowed());
        System.out.println("5.Coordinator: " + mission.getCoordinator().getName() +
                " info:" +mission.getCoordinator().getContactNumber());

        System.out.println("6.Job: ");
        for(int i = 0; i < mission.getJobs().size(); i++)
        {
            System.out.println(Arrays.toString(mission.getJobs().get(i)));
        }

        System.out.println("7.Employment requirements: ");
        for(int i = 0 ;i < mission.getEmploymentRequirements().size(); i++)
        {
            System.out.println(Arrays.toString(mission.getEmploymentRequirements().get(i)));
        }

        System.out.println("8.Cargo requirements for journey: ");
        for(int i = 0 ;i < mission.getJourneyCargo().size(); i++)
        {
            ArrayList<String> js = new ArrayList<>();
            js.add(mission.getJourneyCargo().get(i).getName());
            System.out.print(js);
        }
        System.out.println();
        System.out.println("9.Launch date: " + mission.getLaunchDate());
        System.out.println("10.Location of the destination: " + mission.getDestLocation());
        System.out.println("11.Duration of the mission: " + mission.getMissionDuration());
        System.out.println("12.Status of the mission: " + mission.getMissionStatus());
    }

//    Validate va = new Validate();
//    String choice = va.acceptStringInput("Enter y to exit and n to home menu. ");
//    while (flag)
//    {
//        //create mission
//        //display mission
//        //ask to edit
//        if (choice.trim().equals("n"))
//        {
//            flag = false;
//            System.out.println("Countries allowed added" + countryList);
//        }
//    }

    public ArrayList<String> inputCountriesAllowed()
    {
        Validate va = new Validate();
        boolean flag = true;
        ArrayList<String> countryList = new ArrayList<>();
        System.out.println("Note : Enter at least one country a time.");
        while (flag)
        {
            Boolean add = true;
            String country = va.acceptStringInput("Please Enter Countries allowed: ");
            for (String s : countryList)
            {
                if (country.trim().equals(s))
                {
                    System.out.println(country + " already exist! Enter another Country allowed!");
                    add = false;
                    break;
                }
            }
            if(add){
                countryList.add(country);
            }
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
        int input = va.acceptIntegerInput("Enter the number of status:");
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
        System.out.println("Note : Enter at least one job name a time.");
        while (flag)
        {
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
            }
        }
        return jobs;
    }

    public ArrayList<String[]> inputRequirements()
    {
        ArrayList<String[]> requirements = new ArrayList<>();
        Validate va = new Validate();
        boolean flag = true;
        System.out.println("Note : Enter at least one Employment Title a time.");
        while (flag)
        {
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

    public MissionCoordinator inputCoordinator()
    {
        Validate va = new Validate();
        MissionCoordinator coordinator = new MissionCoordinator();
        String cName = va.acceptStringInput("Please Enter the Coordinator’s name: ");
        coordinator.setName(cName);
        String cInfo = va.acceptStringInput("Please Enter the Coordinator’s contact information: ");
        coordinator.setContactNumber(cInfo);
        return coordinator;
    }

    public ArrayList<ArrayList<String>> cargoRequirements()
    {
        Validate va = new Validate();
        boolean flag = true;

        ArrayList<String> newJourneyCargo = new ArrayList<>();
        ArrayList<String> newMissionCargo = new ArrayList<>();
        ArrayList<String> newOtherMissionCargo = new ArrayList<>();
        ArrayList<ArrayList<String>> cargo = new ArrayList<>();

        System.out.println("Note : Enter p to skip.");
        System.out.println("Note : Enter y for YES and n for NO.");
        while (flag)
        {
            String jCargo = va.acceptStringInput("Please Enter the Cargo requirement for journey: ");
            Boolean add = true;
            for (String s : newJourneyCargo)
            {
                if (jCargo.equals(s))
                {
                    System.out.println(jCargo + " already exist! Enter another cargo!");
                    add = false;
                    break;
                }
            }
            if(jCargo.equals("p"))
                break;
            if(add){
                newJourneyCargo.add(jCargo);
                String choice = va.acceptStringInput("Do You want to add more ? Enter y/n");
                if (choice.trim().equals("n"))
                {
                    flag = false;
                    System.out.println("journey Cargo requirements added" + newJourneyCargo);
                }
            }
        }
        cargo.add(newJourneyCargo);
        flag = true;

        while (flag)
        {
            String mCargo = va.acceptStringInput("Please Enter the Cargo requirement for mission: ");

            Boolean add = true;
            for (String s : newMissionCargo)
            {
                if (mCargo.equals(s))
                {
                    System.out.println(mCargo + " already exist! Enter another cargo!");
                    add = false;
                    break;
                }
            }
            if(mCargo.equals("p"))
                break;
            if(add){
                newMissionCargo.add(mCargo);
                String choice = va.acceptStringInput("Do You want to add more ? Enter y/n");
                if (choice.trim().equals("n"))
                {
                    flag = false;
                    System.out.println("Mission Cargo requirements added" + newMissionCargo);
                }
            }
        }
        cargo.add(newMissionCargo);
        flag = true;

        while (flag)
        {
            String oCargo = va.acceptStringInput("Please Enter the Cargo requirement for other mission: ");

            Boolean add = true;
            for (String s : newOtherMissionCargo)
            {
                if (oCargo.equals(s))
                {
                    System.out.println(oCargo + " already exist! Enter another cargo!");
                    add = false;
                    break;
                }
            }
            if(oCargo.equals("p"))
                break;
            if(add){
                newOtherMissionCargo.add(oCargo);
                String choice = va.acceptStringInput("Do You want to add more ? Enter y/n");
                if (choice.trim().equals("n"))
                {
                    flag = false;
                    System.out.println("Other Mission Cargo requirements added" + newOtherMissionCargo);
                }
            }
        }
        cargo.add(newOtherMissionCargo);
        return cargo;
    }

//    public int menuSelect()
//    {
//        Validate va = new Validate();
//        String menu = "======================Mission to Mars========================\n"
//                + "Please select from the following options\n"
//                + "Press 1 to Login\n"
//                + "Press 2 to select the Space Shuttle\n"
//                + "Press 3 to create Mission\n"
//                + "Press 4 to edit Mission\n"
//                + "Press 5 to Exit\n";
//        System.out.println(menu);
//        int input = va.acceptIntegerInput("");
//        return input;
//    }
//
//    public void startProgram()
//    {
//        Mission mission = new Mission();
//        boolean start = true;
//        while (start)
//        {
//            int integerInput = menuSelect();
//            start = userSelection(integerInput, mission);
//        }
//    }
//
//    public boolean userSelection(int userInput,Mission mission)
//    {
//        Administrator administrator = new Administrator();
//        switch (userInput)
//        {
//            case 1:
//                login(administrator);
//                return true;
//            case 2:
//                if (administrator.getAdminName().trim().length() == 0)
//                {
//                    System.out.println("You need to login first. \n"
//                            +"Please press [Enter] to return to the main menu.");
//                    new Scanner(System.in).nextLine();
//                    return true;
//                }
//                else
//                    startGame(player);
//                return false;
//            case 3:
//                System.out.println("---> HELP MENU <--- \n"
//                        + "For each round, each player will play ONE tile, \n"
//                        + "with the tile value adding to the game total for that round. \n"
//                        + "Provided the game total is less than or equal to 21, \n"
//                        + "the player will get the score for using that tile. \n"
//                        + "However, if the game total is greater than 21, \n"
//                        + "no score is allocated to the player who played the last tile causing the score to become greater than 21. \n"
//                        + "---> Please press [Enter] to return to the main menu. <---");
//                new Scanner(System.in).nextLine();
//                return true;
//            case 4:
//                System.out.println("Thanks for play!");
//                return false;
//        }
//        return true;
//    }

//    public void login(Administrator administrator)
//    {
//        Validate va = new Validate();
//        boolean flag = true;
//        do
//        {
//            String userName = va.acceptStringInput("Please input your user name: ");
//            if (va.stringLengthWithinRange(userName, 3, 10))
//                System.out.println("user name must between 3 and 10 characters");
//            else
//            {
//                administrator.setAdminName(userName);
//                flag = false;
//            }
//        } while (flag);
//        flag = true;
//        do
//        {
//            String password = va.acceptStringInput("Please input your password: ");
//            if (!password.equals("0000"))
//                System.out.println("Wrong password");
//            else
//            {
//                System.out.println("Welcome to Mission to Mars");
//                flag = false;
//            }
//        } while (flag);
//    }

}
