public class Car extends Vehicle {
    private final double horsePower;

    public Car(String licensePlate, int yearOfManufacture, double price, int horsePower) {
        super(licensePlate, yearOfManufacture, price);
        this.horsePower = horsePower;
    }

    //compute longevity of a car
public int computeLongevity() {
        int longevity = 2022 - getYearOfManufacture();
        int result = 20 - longevity;
        try {
            if (result <= 20) {
                throw new Exception("Car is still young");
            } else {
                throw new Exception("Car is old");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                "} " + super.toString();
    }
}
