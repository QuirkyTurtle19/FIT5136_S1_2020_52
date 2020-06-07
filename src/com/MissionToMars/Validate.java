package com.MissionToMars;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//    Scanner input = new Scanner(System.in);
//        System.out.println(displayMessage);
//    //return input.nextLine();

    public String acceptStringInput(String displayMessage)
    {
        while (true) {
            System.out.println(displayMessage);
            System.out.println("===================================\n"
                    + "==== Enter -M to the main menu ====\n" + "==== Enter -Q to quit ====\n");
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            if (line.length() > 0) {
                if (line.equals("-M")){
                    Control control = new Control();
                    control.startProgram();
                }
                else if (line.equals("-Q")){
                    System.out.println("Thanks for using!");
                    System.exit(0);
                }
                return line;
            }
            else {
                System.out.println("Input cannot be empty!");
            }
        }
    }

    public int acceptIntegerInput(String displayMessage)
    {
        while (true) {
            System.out.println(displayMessage);
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            if (line.matches("[0-9]*") && line.length() > 0) {
                return Integer.parseInt(line);
            } else {
                System.out.println("Enter numbers only");
            }
        }
    }

    public boolean stringLengthWithinRange(String value, int min, int max)
    {
        boolean withinRange = true;
        if ((value.trim().length() >= min) && (value.trim().length() <= max))
            withinRange = false;
        return withinRange;
    }

    public boolean isEditNumber (String inputString) {
        Pattern pattern = Pattern.compile("^([1-9]|1[0-2])$");
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }

}
