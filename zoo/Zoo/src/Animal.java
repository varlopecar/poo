abstract public class Animal {
    private String name;
    private int weight;
    private Regime regime;
    abstract public double cost();

    public Animal(String name, int weight, Regime regime) {
        this.name = name;
        this.weight = weight;
        this.regime = regime;
    }

    public void cry() {
        System.out.println(this.name + " is crying.");
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int height) {
        this.weight = height;
    }

    public Regime getRegime() {
        return regime;
    }

    public void setRegime(Regime regime) {
        this.regime = regime;
    }

    @Override
    public String toString() {
        return "Animal " + this.getName() + " weights " + this.getWeight() + " kg and eats " + this.getRegime() + ".";
    }
}
