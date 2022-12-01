package myapp;

public class MakingArrays {
    public static void main(String[] args) {
        String[] tasks = new String[3];
        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";
        // System.out.println(tasks);
        // System.out.println(tasks[0]);
        // System.out.println(tasks[1]);
        // System.out.println(tasks[2]);
        // System.out.println(tasks.length);
        
        // using a WHILE loop to iterate array
        Integer count = 0;
        while (count < tasks.length) {
            System.out.printf("%d. %s\n", count+1, tasks[count]);
            count++;
        }
    }
}
// Lists
// Maps aka dictionaries
// Sets