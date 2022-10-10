public class Transition {
    private State from;
    private State to;
    private String symbol;

    public Transition(State from, State to, String symbol) {
        this.from = from;
        this.to = to;
        this.symbol = symbol;
    }

    public Transition(Transition transition) {
        this.from = transition.from;
        this.to = transition.to;
        this.symbol = transition.symbol;
    }

    public State getFrom() {
        return from;
    }

    public void setFrom(State from) {
        this.from = from;
    }

    public State getTo() {
        return to;
    }

    public void setTo(State to) {
        this.to = to;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public boolean equals(Object object) {
        return object instanceof Transition && this.from.equals(((Transition) object).from) && this.to.equals(((Transition) object).to) && this.symbol.equals(((Transition) object).symbol);
    }

    @Override
    public String toString() {
        return "Transition{" +
                "from=" + from +
                ", to=" + to +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
