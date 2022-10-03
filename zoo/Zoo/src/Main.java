public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Simba", 150, "yellow");
        Canard canard1 = new Canard("Donald", 50, "white");
        Canard canard2 = new Canard("Daisy", 50, "white");

        Zoo zoo = new Zoo("Zoo de Grenoble");
        zoo.addAnimal(lion1);
        zoo.addAnimal(canard1);

        System.out.println(zoo);
        zoo.cry();
        System.out.println("Total cost : " + zoo.totalCost());
    }
}