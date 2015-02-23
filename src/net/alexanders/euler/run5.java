package net.alexanders.euler;

import java.util.*;

public class run5
{
    public static boolean checkDivisible(int number){
        for(int b = 1; b < 20; b++){
            if(number % b != 0){
                return false;
            }
        }
        return true;
    }
    public static void start(){
        int result = 0;
        for(int i=1; i < 100000; i++){
            for(int x=1; x < 100000; x++){
                int temp = i*x;
                if(checkDivisible(temp)){
                    result = temp;
                    break;
                }
            }
            if(result != 0){
                break;
            }
        }
        System.out.println("Result: "+ result);
    }
}
