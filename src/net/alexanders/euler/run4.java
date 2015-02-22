package net.alexanders.euler;

public class run4
{
    private static boolean palindrome(int number){
        String value = String.valueOf(number);
        if(value.endsWith(String.valueOf(value.charAt(0)))){
            if(value.length() == 5){
                if(value.charAt(1) == value.charAt(3)){
                    return true;
                }
            }else{
                if(value.charAt(1) == value.charAt(4) && value.charAt(2) == value.charAt(3)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean palindrome2(int number){
        String value = String.valueOf(number);
        if(value.endsWith(String.valueOf(value.charAt(0)))){
            if(value.length() == 3){
                return true;
            }else{
                if(value.charAt(1) == value.charAt(2)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void start(){
        int last = 0;
        for(int i=100; i < 1000; i++){
            for(int x = 100; x < 1000; x++){
                int calc = i*x;
                if(last != 0){
                    if(palindrome(calc) && calc > last){
                        last = calc;
                    }
                }else{
                    if(palindrome(calc)){
                        last = calc;
                    }
                }
            }
        }
        System.out.println("Result: "+ last);
    }
    public static void start2(){
        int last = 0;
        for(int i=10; i < 100; i++){
            for(int x = 10; x < 100; x++){
                int calc = i*x;
                if(last != 0){
                    if(palindrome2(calc) && calc > last){
                        last = calc;
                    }
                }else{
                    if(palindrome2(calc)){
                        last = calc;
                    }
                }
            }
        }
        System.out.println("Result: "+ last);
    }
}
