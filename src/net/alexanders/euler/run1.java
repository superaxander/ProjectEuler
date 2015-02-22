package net.alexanders.euler;

import java.util.*;

public class run1{
    public static void start(){
        System.out.println("Running Euler Project Challenge 1:");
        List<Integer> foundints = new ArrayList<Integer>();
        for(int i=0; i < 1000; i++){
            if(i%3 == 0){
                foundints.add(i);
            }else if(i%5 == 0){
                foundints.add(i);
            }
        }
        int output = 0;
        for(int b=0; b < foundints.size(); b++){
            output += foundints.get(b);
        }
        System.out.println(output);
    }
}
