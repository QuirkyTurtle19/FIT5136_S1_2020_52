package com.MissionToMars;

public class MissionCoordinator {
    private int id;
    private String name;

    public MissionCoordinator(){
        id = 1;
        name = "";
     }

     public MissionCoordinator(int newId, String newName){
        id = newId;
        name = newName;
     }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
