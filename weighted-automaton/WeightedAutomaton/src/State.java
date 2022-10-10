public class State {
    private String name;

    public State(String name) {
        this.name = name;
    }

    public State(State state) {
        this.name = state.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        return object instanceof State && this.name.equals(((State) object).name);
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                '}';
    }
}
