package net.alexanders.euler;

import java.util.*;

public class run3{
    //I had to cheat a bit here(I had no clue how to find prime factors)
    public static List<Long> primeFactors(long n) {
        List<Long> f = new ArrayList<Long>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                f.add(i);
                n /= i;
                System.out.println(i);
            }
        }
        return f;
    }

    public static void start(){
        List<Long> result = primeFactors(600851475143l);
        System.out.println("Result: " + result.get(result.size() - 1));
    }
}
