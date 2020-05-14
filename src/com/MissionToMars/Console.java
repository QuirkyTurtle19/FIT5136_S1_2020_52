package com.MissionToMars;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Runtime;
import java.util.*;

public class Console {
    Scanner input = new Scanner(System.in);
    public Console(){

    }

    public String acceptString(String message){
        System.out.println(message);
        return input.nextLine();
    }

    public int acceptInt(String message){
        System.out.println(message);
        return input.nextInt();
    }

    public void nextLine(String message){
        System.out.println(message);
        input.nextLine();
    }
}
