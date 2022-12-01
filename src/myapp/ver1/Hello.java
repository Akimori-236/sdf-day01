// package & subpackage
package myapp.ver1;

// import 
// package.package.class
import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        // get system console
        Console cons = System.console();
        // assign console input to variable
        String name = cons.readLine("What is your name? ");
        name = name.trim().toLowerCase();

        // cannot use == for Strings for comparison, use .equals()
        if (name.length() == 0) {
            System.err.println("Please enter your name!");
        } else if (name.isEmpty()) {
            System.err.println("Please enter your name!");
        } else if (name.equals("fred")) {
            name = name.toUpperCase();
            System.out.printf("AYO %s", name);
        } else if (name.equals("harry")) {
            System.out.println("You're a wizard, Harry");
        } else {
            // format string
            System.out.printf("Hello %s. \n", name);
        }

        // SWITCH CASE
        // switch (name.trim().toLowerCase()) {
        // case "":
        // System.err.println("Please enter your name!");
        // case "harry":
        // System.out.println("You're a wizard, Harry");
        // break;
        // case "fred":
        // System.out.println("AYO FRED");
        // break;
        // default:
        // System.out.printf("Hello %s. \n", name);
        // }

        // WHILE
        String name2 = "";
        while (name2.trim().length() <= 0) {
            name2 = cons.readLine("What is your name?");
        }
    }
}
// enter -> flushing buffer