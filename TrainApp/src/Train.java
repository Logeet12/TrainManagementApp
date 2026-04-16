import java.util.*;

class Train {
    private String engineId;
    private List<Bogie> bogies;

    public Train(String engineId) {
        this.engineId = engineId;
        this.bogies = new ArrayList<>();
    }

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public void displaySummary() {
        int totalBogies = bogies.size();
        int totalCapacity = 0;
        Set<String> cargoTypes = new HashSet<>();

        for (Bogie b : bogies) {
            if (b instanceof PassengerBogie) {
                totalCapacity += ((PassengerBogie) b).getCapacity();
            } else if (b instanceof GoodsBogie) {
                cargoTypes.add(((GoodsBogie) b).getCargoType());
            }
        }

        System.out.println("🚆 Train Engine: " + engineId);
        System.out.println("Total Bogies: " + totalBogies);
        System.out.println("Total Passenger Capacity: " + totalCapacity);
        System.out.println("Cargo Types: " + cargoTypes);

        System.out.println("\n--- Train Composition ---");
        for (Bogie b : bogies) {
            b.displayDetails();
        }
    }
}