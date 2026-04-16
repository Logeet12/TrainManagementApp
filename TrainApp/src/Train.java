import java.util.*;

class Train {
    private String engineId;
    private List<Bogie> bogies;
    private Set<String> bogieIds; // ✅ Tracks unique IDs

    public Train(String engineId) {
        this.engineId = engineId;
        this.bogies = new ArrayList<>();
        this.bogieIds = new HashSet<>();
    }

    // ✅ Add Passenger Bogie with uniqueness check
    public void addPassengerBogie(String id, String type, int capacity) {

        if (bogieIds.contains(id)) {
            System.out.println("❌ Duplicate Bogie ID not allowed: " + id);
            return;
        }

        PassengerBogie bogie = new PassengerBogie(id, type, capacity);
        bogies.add(bogie);
        bogieIds.add(id);

        System.out.println("✅ Added Passenger Bogie: " + id);
    }

    // ✅ Remove Bogie (update both List + Set)
    public void removeBogie(String id) {
        Iterator<Bogie> iterator = bogies.iterator();

        while (iterator.hasNext()) {
            Bogie b = iterator.next();

            if (b.id.equals(id)) {
                iterator.remove();
                bogieIds.remove(id); // important!
                System.out.println("Removed Bogie: " + id);
                return;
            }
        }

        System.out.println("Bogie not found: " + id);
    }

    // ✅ Check existence (faster using Set)
    public boolean containsBogie(String id) {
        return bogieIds.contains(id);
    }

    public void displayBogies() {
        System.out.println("\n--- Train Consist ---");
        for (Bogie b : bogies) {
            b.displayDetails();
        }
    }
}