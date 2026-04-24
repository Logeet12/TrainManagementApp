import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Step 1: Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {   // Step 4: Comparison
                found = true;
                break;              // Step 5: Early termination
            }
        }

        // Step 6: Display result
        if (found) {
            System.out.println("Bogie found in the train.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        sc.close();
    }
}