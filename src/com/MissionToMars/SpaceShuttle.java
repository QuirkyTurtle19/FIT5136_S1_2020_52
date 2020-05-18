package com.MissionToMars;

public class SpaceShuttle {

    private String shuttleId;
    private String shuttleName;
    private String manufactureYear;
    private String fuelCapacity;
    private String passengerCapacity;
    private String cargoCapacity;
    private String travelSpeed;
    private String origin;

    public SpaceShuttle() {
        shuttleId = "";
        shuttleName = "";
        manufactureYear = "";
        fuelCapacity = "0";
        passengerCapacity = "0";
        cargoCapacity = "0";
        travelSpeed = "0.0";
        origin = "";
    }

    public SpaceShuttle (String newShuttleId, String NewShuttleName, String NewManufactureYear, String NewFuelCapacity,
                     String NewPassengerCapacity, String NewCargoCapacity, String NewTravelSpeed, String newOrigin){

        shuttleId = newShuttleId;
        shuttleName = NewShuttleName;
        manufactureYear = NewManufactureYear;
        fuelCapacity = NewFuelCapacity;
        passengerCapacity = NewPassengerCapacity;
        cargoCapacity = NewCargoCapacity;
        travelSpeed = NewTravelSpeed;
        origin = newOrigin;
}

    public String getShuttleName(){
        return shuttleName;
    }

    public void setShuttleName(String shuttleName) {
        this.shuttleName = shuttleName;
    }


    public String getManufactureYear(){
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }


    public String getFuelCapacity(){
        return fuelCapacity;
    }

    public void setFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public String getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setPassengerCapacity(String passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


    public String getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(String cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    public String getTravelSpeed(){ return travelSpeed; }

    public void setTravelSpeed(String travelSpeed) {
        this.travelSpeed = travelSpeed;
    }
}