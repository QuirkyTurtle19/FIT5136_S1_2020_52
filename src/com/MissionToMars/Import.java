package com.MissionToMars;

import java.util.ArrayList;

public class Import {

    private FileIO reader;
    private ArrayList<SpaceShuttle> spaceShuttles;
    private ArrayList<Candidate> candidates;
    private ArrayList<Mission> missions;
    private ArrayList<Stock> listOfStock;
    private ArrayList<MissionCoordinator> missionCoordinators;

    public Import(){
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

            String[] workExpArray = singleCandidateArray[11].trim().split(",");
            ArrayList<String> workExpYears = new ArrayList<String>();
            if(workExpArray.length > 1){
                int z = 0;
                while (z < workExpArray.length){
                    workExpYears.add(workExpArray[z]);
                    z++;
                }
            } else {
                workExpYears.add(singleCandidateArray[11]);
            }

            String[] occupationArray = singleCandidateArray[12].trim().split(",");
            ArrayList<String> occupations = new ArrayList<String>();
            if(occupationArray.length > 1 ) {
                int a = 0;
                while (a < occupationArray.length){
                    occupations.add(occupationArray[a]);
                    a++;
                }
            }else{
                occupations.add(singleCandidateArray[12]);
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

            candidates.add(new Candidate(singleCandidateArray[0], singleCandidateArray[1], singleCandidateArray[2], singleCandidateArray[3], singleCandidateArray[4], singleCandidateArray[5], singleCandidateArray[6], singleCandidateArray[7], singleCandidateArray[8], singleCandidateArray[9], qualifications, workExpYears, occupations, singleCandidateArray[13], languages));

        }
        candidates.trimToSize();

        //import stock data
        String stockString = reader.readFile("warehouse.txt");

        String[] stockArray = stockString.split("\n");

        for (int i = 0; i < stockArray.length; i++){
            String[] singleShuttleArray = stockArray[i].split(";");

            listOfStock.add(new Stock(stockArray[0], stockArray[1], Integer.parseInt(stockArray[2])));
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
            if (journeyCargoArray[0].equals("N/A") == false) {
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
            if (missionCargoArray[0].equals("N/A") == false) {
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


}
