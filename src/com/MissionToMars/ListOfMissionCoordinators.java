package com.MissionToMars;

import java.util.ArrayList;

public class ListOfMissionCoordinators {

    private FileIO reader;
    private ArrayList<MissionCoordinator> missionCoordinators;

    public ListOfMissionCoordinators(){
        missionCoordinators = new ArrayList<>();
    }

    public void addMissionCoordinator(String id, String name){
        missionCoordinators.add(new MissionCoordinator(id, name));
    }

    public ArrayList<MissionCoordinator> getMissionCoordinators(){
        return missionCoordinators;
    }

    public ArrayList<MissionCoordinator> createMissionCoordinators(){
        reader = new FileIO();

        String coordinatorString = reader.readFile("missionCoordinators.txt");

        String[] coordinatorArray = coordinatorString.split("\n");

        for(int i = 0; i < coordinatorArray.length; i++){
            String[] singleCoordinator =  coordinatorArray[i].split(";");
            addMissionCoordinator(singleCoordinator[0], singleCoordinator[1]);
        }
        missionCoordinators.trimToSize();
        return missionCoordinators;
    }
}
