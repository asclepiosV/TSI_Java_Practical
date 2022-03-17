package com.isep;

public class Marathon {
    public void printResults(String[] names, int[] times){
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " " + times[i] + "\n");
        }
    }
}
