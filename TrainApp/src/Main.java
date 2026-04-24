import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Step 1: Sorted array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Input key
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Step 3: Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // Step 4: Output
        if (found) {
            System.out.println("Bogie found using Binary Search.");
        } else {
            System.out.println("Bogie NOT found.");
        }

        sc.close();
    }
}