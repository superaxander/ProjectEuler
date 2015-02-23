package net.alexanders.euler;

import java.util.*;

public class run6
{
    public static void start(){
        List<Long> sum = new ArrayList<Long>();
        List<Long> squaredsum = new ArrayList<Long>();
        for(long i=1l; i < 101l; i++){
            sum.add(i);
        }
        for(long x=1l; x < 101l; x++){
            squaredsum.add((long)(Math.pow(Double.valueOf(String.valueOf(x)), 2d)));
        }
        System.out.println("Sum: " + sum.size() + " Squaredsum; " + sum.size());
        long sumresult = 0l;
        for(long square : sum){
            sumresult += square;
        }
        sumresult = (long)(Math.pow(Double.valueOf(String.valueOf(sumresult)), 2d));
        long squaredresult = 0l;
        for(long square2 : squaredsum){
            squaredresult += square2;
        }
        System.out.println("Sumresult: "+ sumresult + " Squaredresult; " + squaredresult);
        System.out.println("Result: "+ (sumresult - squaredresult));
    }
}
