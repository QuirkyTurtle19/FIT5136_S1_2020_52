package com.MissionToMars;

import java.sql.Array;
import java.util.ArrayList;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Control control = new Control();
        control.importAllData();

        //Creating a mission
        UI start = new UI();
        Mission mission = new Mission();
        start.createMission(mission);

        }


}
