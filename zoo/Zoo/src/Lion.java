public class Lion extends Animal {
    private String coatColor;

    public Lion(String name, int height, String coatColor) {
        super(name, height, new Regime("carnivorous", 20));
        this.coatColor = coatColor;
    }

public double cost() {
        return this.getWeight() * this.getRegime().getPrice();
    }

    public String getCoatColor() {
        return coatColor.toString();
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
    public void cry() {
        System.out.println(this.getName() + ", majestic lion with " + this.getCoatColor() + " coat and " + this.getWeight() + " kg weight, is crying.");
    }

}
