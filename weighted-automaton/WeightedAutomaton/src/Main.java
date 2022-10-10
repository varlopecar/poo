import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        State q0 = new State("q0");
        State q1 = new State("q1");
        State q2 = new State("q2");
        State q3 = new State("q3");
        State q4 = new State("q4");
        State q5 = new State("q5");

        WeightedTransition t1 = new WeightedTransition(q0, q1, "a", 1);
        WeightedTransition t2 = new WeightedTransition(q1, q2, "b", 2);
        WeightedTransition t3 = new WeightedTransition(q2, q3, "c", 3);
        WeightedTransition t4 = new WeightedTransition(q3, q4, "d", 4);
        WeightedTransition t5 = new WeightedTransition(q4, q5, "e", 5);
        WeightedTransition t6 = new WeightedTransition(q5, q0, "f", 6);

        WeightedAutomata automata = new WeightedAutomata(new HashSet<>(Arrays.asList(q0, q1, q2, q3, q4, q5)), q0, new HashSet<>(Arrays.asList(q0, q1, q2, q3, q4, q5)), new HashSet<>(Arrays.asList(t1, t2, t3, t4, t5, t6)));

        System.out.println(automata);
    }
}