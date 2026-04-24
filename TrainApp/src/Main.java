import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create HashMap to store bogie -> capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);

        // Display all entries using entrySet()
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}