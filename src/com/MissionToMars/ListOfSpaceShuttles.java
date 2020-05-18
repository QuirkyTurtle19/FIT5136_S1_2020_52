package com.MissionToMars;

import java.util.ArrayList;

public class ListOfSpaceShuttles {
    private ArrayList<SpaceShuttle> spaceShuttles;
    private FileIO reader;

    public ListOfSpaceShuttles(){

        spaceShuttles = new ArrayList<SpaceShuttle>();
    }

    public ArrayList<SpaceShuttle> getSpaceShuttles(){
        return spaceShuttles;
    }

    public void setSpaceShuttles(ArrayList<SpaceShuttle> spaceShuttles) {
        this.spaceShuttles = spaceShuttles;
    }

    public void addShuttle(String shuttleId, String shuttleName, String manufactureYear, String fuelCapacity, String passengerCapacity, String cargoCapacity, String travelSpeed, String origin){
       spaceShuttles.add(new SpaceShuttle(shuttleId, shuttleName, manufactureYear, fuelCapacity, passengerCapacity, cargoCapacity, travelSpeed, origin));
    }

    public SpaceShuttle getASpaceShuttle(int index){
        return spaceShuttles.get(index);
    }





    public void createListOfSpaceShuttles(){

        reader = new FileIO();

        String shuttlesString = reader.readFile("shuttles.txt");

        String[] shuttlesArray = shuttlesString.split("\n");

        for (int i = 0; i < shuttlesArray.length; i++){
            String[] singleShuttleArray = shuttlesArray[i].split(";");

            spaceShuttles.add(new SpaceShuttle(singleShuttleArray[0], singleShuttleArray[1], singleShuttleArray[2], singleShuttleArray[3], singleShuttleArray[4], singleShuttleArray[5], singleShuttleArray[6], singleShuttleArray[7]));
        }
        spaceShuttles.trimToSize();
    }

}
