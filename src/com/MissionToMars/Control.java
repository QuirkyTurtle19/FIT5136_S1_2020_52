package com.MissionToMars;

import java.util.ArrayList;
import java.util.Scanner;

public class Control {


        private FileIO reader;
        private ArrayList<SpaceShuttle> spaceShuttles;
        private ArrayList<Candidate> candidates;
        private ArrayList<Mission> missions;
        private ArrayList<Stock> listOfStock;
        private ArrayList<MissionCoordinator> missionCoordinators;

        public Control(){
            spaceShuttles = new ArrayList<>();
            candidates = new ArrayList<>();
            missions = new ArrayList<>();
            listOfStock = new ArrayList<>();
            missionCoordinators = new ArrayList<>();

        }

        public void importAllData(){
            reader = new FileIO();

            //import mission coordinators
            String coordinatorsString = reader.readFile("missionCoordinators.txt");

            String[] coordinatorsArray;
            coordinatorsArray = coordinatorsString.split("\n");

            for (int i = 0; i < coordinatorsArray.length; i++){
                String[] singleCoordinatorArray = coordinatorsArray[i].split(";");

                missionCoordinators.add(new MissionCoordinator(singleCoordinatorArray[0], singleCoordinatorArray[1], singleCoordinatorArray[2]));
            }
            missionCoordinators.trimToSize();


            //import shuttle data
            String shuttlesString = reader.readFile("shuttles.txt");

            String[] shuttlesArray = shuttlesString.split("\n");

            for (int i = 0; i < shuttlesArray.length; i++){
                String[] singleShuttleArray = shuttlesArray[i].split(";");

                spaceShuttles.add(new SpaceShuttle(singleShuttleArray[0], singleShuttleArray[1], singleShuttleArray[2], singleShuttleArray[3], singleShuttleArray[4], singleShuttleArray[5], singleShuttleArray[6], singleShuttleArray[7]));
            }
            spaceShuttles.trimToSize();

            //import candidate data
            candidates = new ArrayList<Candidate>();
            String candidatesString = reader.readFile("candidates.txt");

            String[] candidatesArray = candidatesString.split("\n");

            for (int i = 0; i < candidatesArray.length; i++) {
                String[] singleCandidateArray = candidatesArray[i].trim().split(";");

                String[] qualsArray = singleCandidateArray[10].split(",");
                ArrayList<String> qualifications = new ArrayList<>();
                int j = 0;
                while (j < qualsArray.length){
                    qualifications.add(qualsArray[j]);
                    j = j+1;
                }


                String[] occupationArray = singleCandidateArray[11].trim().split(",");
                String[] workYearsArray = singleCandidateArray[12].trim().split(",");
                ArrayList<String[]> work = new ArrayList<String[]>();


                if (singleCandidateArray[11].equals("N/A") == false) {
                    if (occupationArray.length > 1) {
                        int a = 0;
                        while (a < occupationArray.length) {
                            work.add(new String[] {occupationArray[a],workYearsArray[a]});
                            a++;
                        }
                    } else {
                        work.add(new String[] {singleCandidateArray[11], singleCandidateArray[12]});
                    }
                }else{
                    work = null;
                }

                String[] languagesArray = singleCandidateArray[14].trim().split(",");
                ArrayList<String> languages = new ArrayList<String>();
                if (languagesArray.length > 1) {
                    int b = 0;
                    while (b < languagesArray.length){
                        languages.add(languagesArray[b]);
                        b++;
                    }
                }else{
                    languages.add(singleCandidateArray[14]);
                }

                ArrayList<String> allergies = new ArrayList<>();
                allergies.add(singleCandidateArray[8]);

                ArrayList<String> food = new ArrayList<>();
                food.add(singleCandidateArray[9]);


                candidates.add(new Candidate(singleCandidateArray[0], singleCandidateArray[1], singleCandidateArray[2], singleCandidateArray[3], singleCandidateArray[4], singleCandidateArray[5], singleCandidateArray[6], singleCandidateArray[7], allergies, food, qualifications, work, singleCandidateArray[13],  languages, null, null));


            }
            candidates.trimToSize();

            //import stock data
            String stockString = reader.readFile("warehouse.txt");

            String[] stockArray = stockString.split("\n");

            for (int i = 0; i < stockArray.length; i++){
                String[] singleStockArray = stockArray[i].split(";");

                listOfStock.add(new Stock(singleStockArray[0], singleStockArray[1], Integer.parseInt(singleStockArray[2])));
            }
            listOfStock.trimToSize();

            // import mission data
            missions = new ArrayList<>();

            String missionsString = reader.readFile("missions.txt");
            String[] missionsArray = missionsString.split("\n");

            for (int i = 0; i < missionsArray.length; i++) {
                String[] singleMissionArray = missionsArray[i].split(";");

                String[] journeyCargoArray = singleMissionArray[8].trim().split(",");
                ArrayList<Stock> journeyCargo = new ArrayList<>();
                if (singleMissionArray[10].trim().equals("N/A") == false) {
                    if (journeyCargoArray.length > 1) {
                        int j = 0;
                        while (j < journeyCargoArray.length) {
                            Stock cargo = new Stock();
                            cargo.setName(journeyCargoArray[j]);
                            cargo.setNumberOnHand(Integer.parseInt(singleMissionArray[9]));
                            journeyCargo.add(cargo);
                            j++;
                        }
                    } else {
                        Stock cargo = new Stock();
                        cargo.setName(singleMissionArray[8]);
                        cargo.setNumberOnHand(Integer.parseInt(singleMissionArray[9]));
                    }
                } else {
                    journeyCargo = null;
                }

                String[] missionCargoArray = singleMissionArray[10].trim().split(",");
                ArrayList<Stock> missionCargo = new ArrayList<>();
                if (singleMissionArray[10].equals("N/A") == false) {
                    if (missionCargoArray.length > 1) {
                        int j = 0;
                        while (j < missionCargoArray.length) {
                            Stock cargo = new Stock();
                            cargo.setName(missionCargoArray[j]);
                            cargo.setNumberOnHand(Integer.parseInt(singleMissionArray[11]));
                            missionCargo.add(cargo);
                            j++;
                        }
                    } else {
                        Stock cargo = new Stock();
                        cargo.setName(singleMissionArray[10]);
                        cargo.setNumberOnHand(Integer.parseInt(singleMissionArray[11]));
                        missionCargo.add(cargo);
                    }
                } else {
                    missionCargo = null;
                }

                //creating jobs
                ArrayList<String[]> jobs = new ArrayList<>();
                jobs.add(new String[] {singleMissionArray[16], singleMissionArray[17]});

                ArrayList<String[]> employmentRequirements = new ArrayList<>();
                employmentRequirements.add(new String[] {singleMissionArray[18], singleMissionArray[19]});



                //import selection criteria for the mission
                String selectionString = reader.readFile("selectionCriteria.txt");
                String[] selectionArray = selectionString.split("\n");


                String[] singleSelection = selectionArray[i].trim().split(";");

                String[] languagesArray = singleSelection[7].trim().split(",");
                ArrayList<String> secondLanguages = new ArrayList<String>();
                if (languagesArray.length > 1) {
                    int b = 0;
                    while (b < languagesArray.length){
                        secondLanguages.add(languagesArray[b]);
                        b++;
                    }
                }else{
                    secondLanguages.add(singleSelection[7]);
                }

                SelectionCriteria selectionCriteria = new SelectionCriteria(Integer.parseInt(singleSelection[0]), Integer.parseInt(singleSelection[1]), Integer.parseInt(singleSelection[2]), singleSelection[3], singleSelection[4], singleSelection[5], singleSelection[6],secondLanguages);

                missions.add(new Mission(singleMissionArray[0], singleMissionArray[1], singleMissionArray[2], singleMissionArray[3], null, Integer.parseInt(singleMissionArray[5]), singleMissionArray[6], singleMissionArray[7], journeyCargo, missionCargo, null, singleMissionArray[11], singleMissionArray[12], jobs, employmentRequirements, selectionCriteria, null, null, null));

                }


        }



        public void selectSpaceShuttle(Mission mission){

            Console console = new Console();
            importAllData();

            for (int i = 0; i < spaceShuttles.size(); i++){
                SpaceShuttle shuttle = spaceShuttles.get(i);
                System.out.println("Shuttle ID: " + shuttle.getShuttleId() + " Shuttle name: " + shuttle.getShuttleName() + " Manufacture year: " + shuttle.getManufactureYear() + " Fuel capacity (Litres): " + shuttle.getFuelCapacity() + " Passenger capacity: " + shuttle.getPassengerCapacity() + " Cargo Capacity (kgs): " + " Travel speed: " + shuttle.getTravelSpeed() + " Origin: " + shuttle.getOrigin());

            }

            String shuttleSelection = console.acceptString("Please enter the Shuttle ID you would like to select");

            for (int z = 0; z < spaceShuttles.size(); z++){
                 if (spaceShuttles.get(z).getShuttleId().equals(shuttleSelection)){

                     mission.setSpaceShuttle(spaceShuttles.get(z));

                     System.out.println(spaceShuttles.get(z).getShuttleName());
                 }
            }

        }



    public String menuSelect()
    {
        boolean flag = true;
        String input = "";
        Validate va = new Validate();
        while(flag){
            String menu = "======================Mission to Mars========================\n"
                    + "Please select from the following options\n"
                    + "Press 1 to Login\n"
                    + "Press 2 to select the Space Shuttle\n"
                    + "Press 3 to create Mission\n"
                    + "Press 4 to edit Mission\n"
                    + "Press 5 to Exit\n";
            System.out.println(menu);
            input = va.acceptStringInput("");
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5"))
                flag = false;
            else
                System.out.println("***** Select from given options(1,2,3,4,5) only! ****");
        }
        return input;
    }

    public void startProgram()
    {
        Mission mission = new Mission();
        Administrator administrator = new Administrator();
        boolean start = true;
        while (start)
        {
            String StringInput = menuSelect();
            start = userSelection(StringInput, mission, administrator);
        }
    }

    public boolean userSelection(String userInput,Mission mission,Administrator administrator)
    {
        UI ui = new UI();
        switch (userInput)
        {
            case "1":
                login(administrator);
                return true;
            case "2":
                if (administrator.getAdminName().trim().length() == 0)
                {
                    System.out.println("You need to login first. \n"
                            +"Please press [Enter] to return to the main menu.");
                    new Scanner(System.in).nextLine();
                    return true;
                }
                else
                    selectSpaceShuttle(mission);
                    System.out.println("Space shuttle " + mission.getSpaceShuttle().getShuttleName() + "is selected to start the mission");
                    System.out.println("You can create a mission now");
                return true;
            case "3":
                if (administrator.getAdminName().trim().length() == 0)
                {
                    System.out.println("You need to login first. \n"
                            +"Please press [Enter] to return to the main menu.");
                    new Scanner(System.in).nextLine();
                    return true;
                }
                else if (mission.getSpaceShuttle().getShuttleName().trim().length() == 0){
                    System.out.println("You need to select a Space Shuttle first. \n"
                            +"Please press [Enter] to return to the main menu.");
                    new Scanner(System.in).nextLine();
                    return true;
                }
                else
                {
                    ui.createMission(mission);
                    return true;
                }
            case "4":
                //validation needed
                ui.getEditInput(mission);
                return true;
            case "5":
                System.out.println("Thanks for using!");
                return false;
        }
        return true;
    }

    public void login(Administrator administrator)
    {
        Validate va = new Validate();
        boolean flag = true;
        do
        {
            String userName = va.acceptStringInput("Please input your user name: ");
            if (va.stringLengthWithinRange(userName, 3, 10))
                System.out.println("user name must between 3 and 10 characters");
            else
            {
                administrator.setAdminName(userName);
                flag = false;
            }
        } while (flag);
        flag = true;
        do
        {
            String password = va.acceptStringInput("Please input your password: ");
            if (!password.equals("0000"))
                System.out.println("Wrong password");
            else
            {
                System.out.println("Welcome to Mission to Mars");
                flag = false;
            }
        } while (flag);
    }

}





