package com.MissionToMars;

import java.util.ArrayList;

public class Warehouse {
    private ArrayList<Stock> listOfStock;
    private FileIO reader;

    public Warehouse(){

        ArrayList<Stock> listOfStock = new ArrayList<Stock>();
    }

    public ArrayList<Stock> getListOfStock() {
        return listOfStock;
    }

    public void setListOfStock(ArrayList<Stock> listOfStock) {
        this.listOfStock = listOfStock;
    }

    public void createListOfStock(){
        reader = new FileIO();

        String stockString = reader.readFile("warehouse.txt");

        String[] stockArray = stockString.split("\n");

        for (int i = 0; i < stockArray.length; i++){
            String[] singleShuttleArray = stockArray[i].split(";");

            listOfStock.add(new Stock(stockArray[0], stockArray[1], Integer.parseInt(stockArray[2])));
        }
        listOfStock.trimToSize();
    }

}
