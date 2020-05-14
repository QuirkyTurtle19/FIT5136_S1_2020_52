package com.MissionToMars;

public class Validate {

    public boolean stringNotZeroLength(String aString){
        aString = aString.trim();
        int length = aString.length();
        if (length == 0) {
            return false;
        }
        return true;
        }

    public boolean checkStringLength(String aString, int min, int max){

        aString = aString.trim();
        int length = aString.length();
        if(length < min || length > max){
            return false;
        }
        return true;
    }

    public boolean numberRange(int anInt, int min, int max){
        if (anInt < min || anInt < max){
            return false;
        }
        return true;
    }

    public boolean isStringNumeric(String aString){
        int position = 0;
        while (position < aString.length()){
            char thisChar = aString.charAt(position);
            if (thisChar > '0' && thisChar < '9'){
                return true;
            }
            position++;
        }
        return false;
    }


}
