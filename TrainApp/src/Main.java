public class Main {
    public static void main(String[] args) {

        Train train = new Train("ENG101");

        // Add bogies dynamically
        train.addPassengerBogie("P1", "Sleeper", 72);
        train.addPassengerBogie("P2", "AC Chair", 50);

        train.displayBogies();

        // Check existence
        System.out.println("P1 exists? " + train.containsBogie("P1"));

        // Remove bogie
        train.removeBogie("P1");

        train.displayBogies();
    }
}