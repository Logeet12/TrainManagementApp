import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create LinkedHashSet for ordered + unique bogies
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Adding bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        boolean isAdded = train.add("Sleeper");
        if (!isAdded) {
            System.out.println("Duplicate bogie ignored: Sleeper");
        }

        // Display final formation
        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}