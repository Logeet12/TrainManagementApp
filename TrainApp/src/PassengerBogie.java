class PassengerBogie extends Bogie {
    private String type; // Sleeper, AC Chair, First Class
    private int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        super(id);
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void displayDetails() {
        System.out.println(id + " | Passenger | " + type + " | Capacity: " + capacity);
    }
}