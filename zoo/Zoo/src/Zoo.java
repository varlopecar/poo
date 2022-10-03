import java.util.LinkedList;

public class Zoo {
    private String name;
    private LinkedList<Animal> animals;

public Zoo(String name) {
        this.name = name;
        this.animals = new LinkedList<>();
    }

    public int getAnimalsCount() {
        return animals.size();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void cry() {
        for (Animal animal : animals) {
            animal.cry();
        }
    }

    public double totalCost() {
        double totalCost = 0;
        for(int i = 0; i < animals.size(); i++) {
            totalCost += animals.get(i).cost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Le zoo " + name + ", contient : " + animals;
    }
}
