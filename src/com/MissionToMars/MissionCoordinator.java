package com.MissionToMars;

public class MissionCoordinator {
    private String id;
    private String name;

    public MissionCoordinator(){
        id = "";
        name = "";
     }

     public MissionCoordinator(String newId, String newName){
        id = newId;
        name = newName;
     }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
