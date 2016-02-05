package net.alexanders.euler;

public class run7
{
    private static boolean isPrime(int number)
    {
        for (int i = number-1; i > 1; i--)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static void start()
    {
        int currentNumber = 2;
        for (int i = 0; i < 10001; i++)
        {
            while(!isPrime(currentNumber++))
                ;
        }
        System.out.println(currentNumber-1);
    }
}
