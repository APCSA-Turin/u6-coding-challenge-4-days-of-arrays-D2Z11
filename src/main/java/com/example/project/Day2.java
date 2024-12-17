
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] list = new String[2][names.length];
        int o1 = 0;
        int o2 = 0;
        for (int i = 0; i < names.length; i++) {
            int rand = (int) (Math.random() * 2);
            if (rand == 0) {
                list[0][o1] = names[i];
                o1++;
            } else if (rand == 1) {
                list[1][o2] = names[i];
                o2++;
            }          
        }
        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}