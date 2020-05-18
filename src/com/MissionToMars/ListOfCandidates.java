package com.MissionToMars;

import java.util.ArrayList;

public class ListOfCandidates {
    private ArrayList<Candidate> listOfCandidates;
    private FileIO reader;

    public ListOfCandidates(){
        ArrayList<Candidate> listOfCandidates = new ArrayList<Candidate>();
    }

    public Candidate getACandidate(int index) {

        return listOfCandidates.get(index);
    }

    public void createListOfCandidates(){
        reader = new FileIO();

        String candidatesString = reader.readFile("short.candidates.txt");

        String[] candidatesArray = candidatesString.split("\n");

        for (int i = 0; i < candidatesArray.length; i++) {
            String[] singleCandidateArray = candidatesArray[i].split(";");

            String[] qualsArray = singleCandidateArray[10].split(",");
            ArrayList<String> qualifications = new ArrayList<>();
            int j = 0;
            do {
                qualifications.add(qualsArray[j]);
                j++;
            } while (j < qualsArray.length);

            String[] workExpArray = singleCandidateArray[11].split(",");
            ArrayList<String> workExpYears = new ArrayList<String>();
            if{workExpArray.length != 0){
            int z = 0;
            do {
                workExpYears.add(workExpArray[z]);
                z++;
            }while(z < workExpArray.length);

            String[] occupationArray = singleCandidateArray[12].split(",");
            ArrayList<String> occupations = new ArrayList<String>();
            if(occupationArray.length == 0 ) {
                int a = 0;
                do {
                    occupations.add(occupationArray[a]);
                    a++;
                } while (a < occupationArray.length);
            }


            String[] languagesArray = singleCandidateArray[14].split(",");
            ArrayList<String> languages = new ArrayList<String>();
            if (languagesArray.length == 0) {
                int b = 0;
                do {
                    languages.add(occupationArray[b]);
                    b++;
                } while (b < languagesArray.length);
            }
            System.out.println("check");
            //listOfCandidates.add(new Candidate(singleCandidateArray[0], singleCandidateArray[1], singleCandidateArray[2], singleCandidateArray[3], singleCandidateArray[4], singleCandidateArray[5], singleCandidateArray[6], singleCandidateArray[7], singleCandidateArray[8], singleCandidateArray[9], qualifications, workExpYears, occupations, singleCandidateArray[13], languages));

            }
       listOfCandidates.trimToSize();
    }
    }





