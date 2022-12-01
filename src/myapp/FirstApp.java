// Name of package
package myapp;

// Imports
// none

// Class definition (one class per file, class name = file name)
public class FirstApp {
    // entry point
    public static void main(String[] args) {
        System.out.println("Hello, world");
        System.out.println("This is SDF");
    }
}

// COMPILE the file from .java to .class (create compiled artifacts)
// javac -sourcepath src -d classes src/myapp/*
// -d = destination, * = all files

// RUN the Java Virtual Machine
// java -cp classes myapp.FirstApp
// -cp = classpath, . instead of / for filepath

// BigInt
// BigDecimal
