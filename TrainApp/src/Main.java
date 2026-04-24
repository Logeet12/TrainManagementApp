import java.util.*;

class GoodsBogie {
    String type;   // e.g., Cylindrical, Box
    String cargo;  // e.g., Petroleum, Coal

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class Main {
    public static void main(String[] args) {

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Safety rule using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum"))
                                || (!b.type.equals("Cylindrical"))
                );

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is NOT SAFE");
        }
    }
}