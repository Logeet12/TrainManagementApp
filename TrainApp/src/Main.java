import java.util.*;

public class Main{

    public static void main(String[] args) {

        // Step 1: Bogie collection (try empty vs non-empty)
        List<String> bogies = new ArrayList<>();
        // bogies.add("BG101"); // uncomment to test valid case

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            searchBogie(bogies, key);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Step 2: Search method with validation
    public static void searchBogie(List<String> bogies, String key) {

        // Defensive check
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Train has no bogies. Search cannot be performed.");
        }

        // Step 3: Perform search (linear for simplicity)
        boolean found = false;
        for (String id : bogies) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Step 4: Result
        if (found) {
            System.out.println("Bogie found.");
        } else {
            System.out.println("Bogie not found.");
        }
    }
}