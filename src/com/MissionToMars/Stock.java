package com.MissionToMars;

public class Stock {
    private String code;
    private String name;
    private Integer numberOnHand;

    public Stock(){
        code = "";
        name = "";
        numberOnHand = 0;
    }

    public Stock(String newCode, String newName, Integer newNumberOnHand){
        code = newCode;
        name = newName;
        numberOnHand = newNumberOnHand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOnHand() {
        return numberOnHand;
    }

    public void setNumberOnHand(Integer numberOnHand) {
        this.numberOnHand = numberOnHand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
