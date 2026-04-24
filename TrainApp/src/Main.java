public class Main {
    public static void main(String[] args) {

        // Step 1: Array of capacities
        int[] capacities = {72, 78, 24, 60, 90};

        // Step 2: Bubble Sort
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            // After each pass, largest element moves to end
            for (int j = 0; j < n - i - 1; j++) {

                // Step 3: Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Step 4: Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 5: Display sorted result
        System.out.println("Sorted Capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
    }
}