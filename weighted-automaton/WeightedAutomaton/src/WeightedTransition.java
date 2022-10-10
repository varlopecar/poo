public class WeightedTransition extends Transition {
    private int weight;

    public WeightedTransition(State from, State to, String symbol, int weight) {
        super(from, to, symbol);
        this.weight = weight;
    }

    public WeightedTransition(WeightedTransition weightedTransition) {
        super(weightedTransition);
        this.weight = weightedTransition.weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean equals(Object object) {
        return object instanceof WeightedTransition && super.equals(object) && this.weight == ((WeightedTransition) object).weight;
    }

    @Override
    public String toString() {
        return "WeightedTransition{" +
                "from=" + super.getFrom() +
                ", to=" + super.getTo() +
                ", symbol='" + super.getSymbol() + '\'' +
                ", weight=" + weight +
                '}';
    }
}
