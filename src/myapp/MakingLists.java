package myapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.io.Console;

public class MakingLists {
    public static void main(String[] args) {
        // ORDERED
        // some lists have fixed size
        // can have duplicates
        // LinkedList<String> myList = new LinkedList<>();
        // for (int i = 0; i < myList.size(); i++) {
        // System.out.printf("%d. %s\n", i+1, myList.get(i));
        // }

        // list of numbers
        List<Integer> listOfInt = new LinkedList<>();
        Console cons = System.console();
        while (true) {
            String input = cons.readLine("").trim();
            if (input.equals("stop")) {
                break;
            } else {
                listOfInt.add(Integer.parseInt(input));
            }
        }
        System.out.printf("No. of integers: %d\n", listOfInt.size());
        // System.out.println(listOfInt);
        for (int i = 0; i < listOfInt.size(); i++) {
            System.out.printf("%d -> %d\n", i, listOfInt.get(i));
        }

        // STACK <= special type of list
        // can only access last added item
        // last in first out

        // QUEUE <= special type of list
        // can only access first added item
        // First in First out
    }
}
