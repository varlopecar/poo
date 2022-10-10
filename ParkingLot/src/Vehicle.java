public abstract class Vehicle {
    private String licensePlate;
    private int yearOfManufacture;
    private double price;

    public Vehicle(String licensePlate, int yearOfManufacture, double price) {
        this.licensePlate = licensePlate;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public abstract int computeLongevity();

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                '}';
    }
}
