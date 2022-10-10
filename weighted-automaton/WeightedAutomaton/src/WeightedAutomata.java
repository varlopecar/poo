import java.util.*;

public class WeightedAutomata {
    private Set<String> alphabet;
    private Map<State, List<WeightedTransition>> automata;
    private Set<State> finalStates;
    private State initialState;

    public WeightedAutomata(Set<State> states, State initialState, Set<State> finalStates, Set<WeightedTransition> transitions) {
        this.initialState = initialState;
        this.finalStates = finalStates;
        this.alphabet = computeAlphabet(transitions);
        computeAutomata(states, transitions);
    }

    public HashSet<String> computeAlphabet(Set<WeightedTransition> transitions) {
        HashSet<String> alphabet = new HashSet<>();
        for (WeightedTransition transition : transitions) {
            alphabet.add(transition.getSymbol());
        }
        return alphabet;
    }

    public void computeAutomata(Set<State> states, Set<WeightedTransition> transitions) {
        HashMap<State, ArrayList<Transition>> automata = new HashMap<>();
        for (State state : states) {
            ArrayList<Transition> transitionsFromState = new ArrayList<>();
            for (WeightedTransition transition : transitions) {
                if (transition.getFrom().equals(state)) {
                    transitionsFromState.add(transition);
                }
            }
            automata.put(state, transitionsFromState);
        }
    }

    @Override
    public String toString() {
        return "WeightedAutomata{" +
                "alphabet=" + alphabet +
                ", automata=" + automata +
                ", finalStates=" + finalStates +
                ", initialState=" + initialState +
                '}';
    }
}
