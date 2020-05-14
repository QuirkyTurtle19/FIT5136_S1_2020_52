package com.MissionToMars;

public class Administrator {

    private String admindName;
    private String adminId;

    public Administrator(){
        admindName = "";
        adminId = "";
    }

    public Administrator(String name, String id){
        admindName = name;
        adminId = id;
    }

    public String getAdmindName() {
        return admindName;
    }

    public String getAdminId(){
        return adminId;
    }

    public void setAdmindName(String admindName) {
        this.admindName = admindName;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
}
