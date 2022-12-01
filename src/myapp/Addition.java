package myapp;

import java.io.Console;

public class Addition {
    public static void main(String[] args) {
        // Enter a number: 10
        // Enter a number: 3
        // Enter a number: 4
        // Enter a number: stop
        // The total is 17

        // Integer.parseInt(input)

        Integer total = 0;
        Integer count = 0;
        String input = "";
        Console cons = System.console();

        while (true) {
            input = cons.readLine("Enter a Number: ");
            input = input.trim().toLowerCase();
            if (input.equals("stop")) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    System.out.printf("%d is added.\n", num);
                    count++;
                    total += num;
                } catch (Exception e) {
                    System.err.println("Please enter a number!\n");
                }
            }
        }
        System.out.printf("The sum of %d numbers is %d", count, total);
    }
}