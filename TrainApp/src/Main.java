public class Main {
    public static void main(String[] args) {

        Train train = new Train("ENG202");

        train.addPassengerBogie("BG101", "Sleeper", 72);
        train.addPassengerBogie("BG102", "AC Chair", 50);

        // Try duplicate
        train.addPassengerBogie("BG101", "First Class", 40);

        train.displayBogies();
    }
}