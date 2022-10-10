public class Truck extends Vehicle {
    private int maxLoad;

    public Truck(String licensePlate, int yearOfManufacture, double price, int maxLoad) {
        super(licensePlate, yearOfManufacture, price);
        this.maxLoad = maxLoad;
    }

    //compute longevity of a truck
    public int computeLongevity() {
        int longevity = 2022 - getYearOfManufacture();
        int result = 30 - longevity;
        try {
            if (result <= 30) {
                throw new Exception("Truck is still young");
            } else {
                throw new Exception("Truck is old");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoad=" + maxLoad +
                "} " + super.toString();
    }
}
