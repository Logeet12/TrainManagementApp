public class Main {
        public static void main(String[] args) {

            Train train = new Train("ENG123");

            // Add Passenger Bogies
            train.addBogie(new PassengerBogie("B1", "Sleeper", 72));
            train.addBogie(new PassengerBogie("B2", "AC Chair", 50));

            // Add Goods Bogies
            train.addBogie(new GoodsBogie("G1", "Rectangular", "Coal"));
            train.addBogie(new GoodsBogie("G2", "Cylindrical", "Oil"));

            // Display Summary
            train.displaySummary();
        }
    }
