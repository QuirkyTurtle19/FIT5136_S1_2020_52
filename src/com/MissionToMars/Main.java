package com.MissionToMars;

import java.sql.Array;
import java.util.ArrayList;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ListOfCandidates list = new ListOfCandidates();
        list.createListOfCandidates();
        System.out.println(list.getACandidate(6).getLanguageList().get(1));

        }






}
