import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Step 1: Ensure uniqueness
        HashSet<String> uniqueBogies = new HashSet<>();

        // Step 2: Maintain order
        LinkedList<String> train = new LinkedList<>();

        // Adding bogies
        addBogie("Engine", uniqueBogies, train);
        addBogie("Sleeper", uniqueBogies, train);
        addBogie("AC", uniqueBogies, train);
        addBogie("Cargo", uniqueBogies, train);
        addBogie("Guard", uniqueBogies, train);

        // Attempt duplicate
        addBogie("AC", uniqueBogies, train); // will be ignored

        // Insert Pantry Car at position 2
        train.add(2, "Pantry");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final train consist
        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }

    // Method to ensure no duplicates
    public static void addBogie(String bogie, Set<String> set, List<String> list) {
        if (set.add(bogie)) {
            list.add(bogie);
        } else {
            System.out.println("Duplicate bogie ignored: " + bogie);
        }
    }
}