package myapp;

import java.io.Console;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> listOfInt = new LinkedList<>();

        Console cons = System.console();

        String item = "";

        while(true) {
            item = cons.readLine("please enter a number: ");
            item = item.trim();

            if (item.equals("stop")) break;

            listOfInt.add(Integer.parseInt(item));
        }

        System.out.printf("NUmber of elements in the list: %d\n", listOfInt.size());
        for (int i = 0; i < listOfInt.size(); i++) {
            System.out.println(listOfInt.get(i));
        }

    }
}
