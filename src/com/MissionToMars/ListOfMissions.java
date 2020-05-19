package com.MissionToMars;

import java.util.ArrayList;

public class ListOfMissions {
    private ArrayList<Mission> missions;
    private FileIO reader;

    public ListOfMissions(){
        ArrayList<Mission> missions = new ArrayList<>();
    }

    public ArrayList<Mission> getMissions() {
        return missions;
    }

    public void setMissions(ArrayList<Mission> missions) {
        this.missions = missions;
    }

    public Mission getAMission(int index){
        return missions.get(index);
    }

    public void createListOfMissions(){
        reader = new FileIO();
        missions = new ArrayList<>();

        String missionsString = reader.readFile("Missions.txt");
        String[] missionsArray = missionsString.split("\n");

        for (int i = 0; i < missionsArray.length; i++){
            String[] singleMissionArray = missionsArray[i].split(";");

            String[] countriesAllowedArray = singleMissionArray[4].split(",");
            ArrayList<String> countriesAllowed = new ArrayList<>();
            if(countriesAllowedArray.length > 1) {
                int j = 0;
                while (j < countriesAllowedArray.length) {
                    countriesAllowed.add(countriesAllowedArray[j]);
                    j++;
                }
            }else {
                countriesAllowed.add(singleMissionArray[4]);
                }

            String[] cargoRequiredArray = singleMissionArray[9].split(",");
            ArrayList<String> cargoRequired = new ArrayList<>();
            if (cargoRequiredArray.length > 1){
                int x = 0;
                while (x < cargoRequiredArray.length) {
                    cargoRequired.add(cargoRequiredArray[x]);
                    x++;
                }
            } else {
                cargoRequired.add(singleMissionArray[9]);
            }







            }

    }

}
