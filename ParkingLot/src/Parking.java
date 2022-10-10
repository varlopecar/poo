public class Parking {
    private Vehicle[] vehicles;

    public Parking(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        Vehicle[] newVehicles = new Vehicle[vehicles.length + 1];
        for (int i = 0; i < vehicles.length; i++) {
            newVehicles[i] = vehicles[i];
        }
        newVehicles[vehicles.length] = vehicle;
        vehicles = newVehicles;
    }

    public void totalValue() {
        double totalValue = 0;
        for (Vehicle vehicle : vehicles) {
            totalValue += vehicle.getPrice();
        }
        System.out.println("Total value of all vehicles: " + totalValue);
    }

    public void totalLongevity() {
        int totalLongevity = 0;
        for (Vehicle vehicle : vehicles) {
            totalLongevity += vehicle.computeLongevity();
        }
        System.out.println("Total longevity of all vehicles: " + totalLongevity);
    }
}
