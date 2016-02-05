package net.alexanders.euler;

import java.util.*;

public class Main {

    public static void start(String temp){
        switch(Integer.parseInt(temp)){
            default: System.out.println("Invalid"); System.exit(-1); break;
            case 1: run1.start(); break;
            case 2: run2.start(); break;
            case 3: run3.start(); break;
            case 4: run4.start(); break;
            case 5: run5.start(); break;
            case 6: run6.start(); break;
            case 7: run7.start(); break;
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        if(args.length == 1){
            start(args[0]);
        }else{
            while(running){
                System.out.print("Which challenge do you want to run? ");
                Scanner scanner = new Scanner(System.in);
                String line = scanner.nextLine();
                if(line.equalsIgnoreCase("q")){
                    running = false;
                }else{
                    start(line);
                }
            }
        }
    }


}
