import java.util.*;

class Train {
    private String engineId;
    private List<Bogie> bogies;

    public Train(String engineId) {
        this.engineId = engineId;
        this.bogies = new ArrayList<>();
    }

    // ✅ Add Passenger Bogie
    public void addPassengerBogie(String id, String type, int capacity) {
        PassengerBogie bogie = new PassengerBogie(id, type, capacity);
        bogies.add(bogie);
        System.out.println("Added Passenger Bogie: " + id);
    }

    // ✅ Remove Bogie by ID
    public void removeBogie(String id) {
        Iterator<Bogie> iterator = bogies.iterator();

        while (iterator.hasNext()) {
            Bogie b = iterator.next();
            if (b.id.equals(id)) {
                iterator.remove();
                System.out.println("Removed Bogie: " + id);
                return;
            }
        }

        System.out.println("Bogie not found: " + id);
    }

    // ✅ Check if Bogie Exists
    public boolean containsBogie(String id) {
        for (Bogie b : bogies) {
            if (b.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    // Display
    public void displayBogies() {
        System.out.println("\n--- Current Train Consist ---");
        for (Bogie b : bogies) {
            b.displayDetails();
        }
    }
}