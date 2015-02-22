package net.alexanders.euler;

import java.util.*;

public class run2{
    private static int fib(int number){
        if(number == 1 || number == 0){
            return number;
        }else{
            return fib(number-1) + fib(number -2);
        }
    }

    public static void start(){
        int i = 3;
        int addedInt = 0;
        List<Integer> resultList = new ArrayList<Integer>();
        do{
            addedInt = fib(i);
            i++;
            if(addedInt%2==0){
                resultList.add(addedInt);
                System.out.println(addedInt);
            }
        }while(addedInt < 4000000);
        int result = 0;
        for(int results : resultList){
            result += results;
        }
        System.out.println("Result: "+ result);
    }
}
