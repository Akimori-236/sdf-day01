package myapp;

// import 
// package.package.class
import java.io.Console;

public class Variables {
    public static void main(String[] args) {
        String greetings;
        greetings = "Hello, world";
        System.out.println(greetings);
        //hexa
        Integer x = 0x5e;
        System.out.println(x);
        // output to stderr 
        System.err.println(x);

        // get console/keyboard
        Console cons = System.console();
        
    }
}

// Binary -> 0-1
// Hexadecimal -> 0-F (0x5e)
// Octa -> 0-7

// 2 outputs (stdout, stderr)
// 1 input (stdin)
