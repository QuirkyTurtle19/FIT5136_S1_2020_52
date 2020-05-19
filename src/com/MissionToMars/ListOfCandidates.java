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
        listOfCandidates = new ArrayList<Candidate>();
        String candidatesString = reader.readFile("short.candidates.txt");

        String[] candidatesArray = candidatesString.split("\n");

        for (int i = 0; i < candidatesArray.length; i++) {
            String[] singleCandidateArray = candidatesArray[i].trim().split(";");

            String[] qualsArray = singleCandidateArray[10].split(",");
            ArrayList<String> qualifications = new ArrayList<>();
            int j = 0;
            while (j < qualsArray.length){
                qualifications.add(qualsArray[j]);
                j = j+1;
            }

            String[] workExpArray = singleCandidateArray[11].trim().split(",");
            ArrayList<String> workExpYears = new ArrayList<String>();
            if(workExpArray.length > 1){
                int z = 0;
                while (z < workExpArray.length){
                    workExpYears.add(workExpArray[z]);
                    z++;
                }
            } else {
                workExpYears.add(singleCandidateArray[11]);
            }

            String[] occupationArray = singleCandidateArray[12].trim().split(",");
            ArrayList<String> occupations = new ArrayList<String>();
            if(occupationArray.length > 1 ) {
                int a = 0;
                while (a < occupationArray.length){
                    occupations.add(occupationArray[a]);
                    a++;
                }
            }else{
                occupations.add(singleCandidateArray[12]);
            }

            String[] languagesArray = singleCandidateArray[14].trim().split(",");
            ArrayList<String> languages = new ArrayList<String>();
            if (languagesArray.length > 1) {
                int b = 0;
                while (b < languagesArray.length){
                    languages.add(languagesArray[b]);
                    b++;
                }
            }else{
                languages.add(singleCandidateArray[14]);
            }

            listOfCandidates.add(new Candidate(singleCandidateArray[0], singleCandidateArray[1], singleCandidateArray[2], singleCandidateArray[3], singleCandidateArray[4], singleCandidateArray[5], singleCandidateArray[6], singleCandidateArray[7], singleCandidateArray[8], singleCandidateArray[9], qualifications, workExpYears, occupations, singleCandidateArray[13], languages));

            }
       listOfCandidates.trimToSize();
    }
    }





