import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Step 1: Array of bogie type names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Step 2: Sort using built-in method
        Arrays.sort(bogies);

        // Step 3: Display sorted result
        System.out.println("Sorted Bogie Types:");
        System.out.println(Arrays.toString(bogies));
    }
}