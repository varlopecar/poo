public class Canard extends Animal {
    private String plumeColor;

    public Canard(String name, int height, String plumeColor) {
        super(name, height, new Regime("vegetarian", 10));
        this.plumeColor = plumeColor;
    }

    public double cost() {
        return this.getWeight() * this.getRegime().getPrice();
    }

    public String getPlumeColor() {
        return plumeColor.toString();
    }

    public void setPlumeColor(String plumeColor) {
        this.plumeColor = plumeColor;
    }

    public void cry() {
        System.out.println(this.getName() + ", majestic duck with " + this.getPlumeColor() + " plume and " + this.getWeight() + " kg weight, is crying.");
    }
}
