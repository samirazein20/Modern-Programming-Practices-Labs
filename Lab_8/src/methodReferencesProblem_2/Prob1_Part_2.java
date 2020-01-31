package methodReferencesProblem_2;

import java.util.function.Supplier;

public class Prob1_Part_2 {
    public static void main(String[] args) {
        Supplier<Double> s = () -> Math.random();
        System.out.println(s.get());
    }
}
