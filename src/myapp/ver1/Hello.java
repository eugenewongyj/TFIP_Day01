package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        
        // Get system console
        Console cons = System.console();

        // Read from the console, the result is assigned to a variable
        // String name = cons.readLine("What is your name? "); 
        String name = "";
        while (name.trim().length() <= 0) {
            name = cons.readLine("What is your name? ");
        }

        if (name.trim().equals("fred")) {
            System.out.println("Yabadabadoo");
        }
        else if (name.trim().equals("barney")) {
            System.out.println("Hello barney");
            
        } 
        // name.trim().equals("")
        // name.trim().isEmpty()
        // name.trim().length() == 0
        else if (name.isBlank()) {
            System.out.println("Please write your name");
        }
        else {
            // Send a greeting to the name
            System.out.printf("Hello %s. Nice to make your acquaintance\n", name.toUpperCase());
        }

    }
    
}
