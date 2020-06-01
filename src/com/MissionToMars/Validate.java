package com.MissionToMars;

import java.util.Scanner;

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

    public String acceptStringInput(String displayMessage)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(displayMessage);
        return input.nextLine();
    }

    public int acceptIntegerInput(String displayMessage)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(displayMessage);
        return input.nextInt();
    }

    public boolean stringLengthWithinRange(String value, int min, int max)
    {
        boolean withinRange = true;
        if ((value.trim().length() >= min) && (value.trim().length() <= max))
            withinRange = false;
        return withinRange;
    }


}
