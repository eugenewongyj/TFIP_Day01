package myapp;

import java.io.Console;

public class Variables {
    public static void main(String[] args) {
        // Get system console
        Console cons = System.console();

        // Read from the console, the result is assigned to a variable
        String name = cons.readLine("What is your name? "); 

        // Send a greeting to the name
        System.out.println(name);
    } 
    
}
