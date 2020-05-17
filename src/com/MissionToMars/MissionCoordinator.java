package com.MissionToMars;

public class MissionCoordinator {
    private String id;
    private String name;
    private String contactNumber;

    public MissionCoordinator(){
        id = "";
        name = "";
        contactNumber = "";
     }

     public MissionCoordinator(String newId, String newName, String newContact){
        id = newId;
        name = newName;
        contactNumber = newContact;
     }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
