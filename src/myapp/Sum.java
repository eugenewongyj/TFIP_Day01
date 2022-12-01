package myapp;

import java.io.Console;

public class Sum {
    public static void main(String[] args) {
        Console console = System.console();

        int sum = 0;

        while (true) {
            String userInput = console.readLine("Enter a number: ").trim().toLowerCase();

            if (userInput.equals("stop")) {
                break;
            }

            sum += Integer.parseInt(userInput);
            
        }

        // Prof's solution which does not do while(true)

        System.out.printf("The total is %d.", sum);

        String input = "";
        Integer total = 0;
        Integer count = 0;

        Console cons = System.console();

        while(!input.equals("stop")) {
            input = cons.readLine("Please enter a number: ");
            input = input.trim();
            if (input.equals("stop")) {
                break;
            }

            count++;

            total += Integer.parseInt(input);
        }

        System.out.printf("The total of adding %d number is %d\n", count, total);
    }
    
}
