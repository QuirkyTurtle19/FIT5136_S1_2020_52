package com.MissionToMars;

public class SpaceShuttle {

    private String shuttleName;
    private String manufactureYear;
    private Integer fuelCapacity;
    private Integer passengerCapacity;
    private Integer cargoCapacity;
    private Double travelSpeed;

    public SpaceShuttle() {
        shuttleName = "";
        manufactureYear = "";
        fuelCapacity = 0;
        passengerCapacity = 0;
        cargoCapacity = 0;
        travelSpeed = 0.0;
    }

    public SpaceShuttle (String NewShuttleName, String NewManufactureYear, Integer NewFuelCapacity,
                     Integer NewPassengerCapacity, Integer NewCargoCapacity, Double NewTravelSpeed){
        shuttleName = NewShuttleName;
        manufactureYear = NewManufactureYear;
        fuelCapacity = NewFuelCapacity;
        passengerCapacity = NewPassengerCapacity;
        cargoCapacity = NewCargoCapacity;
        travelSpeed = NewTravelSpeed;
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


    public Integer getFuelCapacity(){
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public Integer getPassengerCapacity(){
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


    public Integer getCargoCapacity(){
        return cargoCapacity;
    }

    public void setCargoCapacity(Integer cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    public Double getTravelSpeed(){
        return travelSpeed;
    }

    public void setTravelSpeed(Double travelSpeed) {
        this.travelSpeed = travelSpeed;
    }
}