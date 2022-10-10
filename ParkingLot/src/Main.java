public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("ABC-123", 2020, 10000, 100);
        vehicles[1] = new Truck("DEF-456", 2015, 20000, 2000);
        vehicles[2] = new Car("GHI-789", 2018, 30000, 150);
        Parking parking = new Parking(vehicles);
        parking.addVehicle(new Truck("JKL-012", 2019, 40000, 3000));
        parking.totalValue();
        parking.totalLongevity();
    }
}