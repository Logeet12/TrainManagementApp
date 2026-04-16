class GoodsBogie extends Bogie {
    private String shape; // Rectangular / Cylindrical
    private String cargoType;

    public GoodsBogie(String id, String shape, String cargoType) {
        super(id);
        this.shape = shape;
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public void displayDetails() {
        System.out.println(id + " | Goods | " + shape + " | Cargo: " + cargoType);
    }
}