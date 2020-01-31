package methodReferencesProblem_3;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana", "Orange", "Cherries", "Blums");
        fruits.forEach((x) -> System.out.println(x));
        System.out.println("--------------------------METHOD REFERENCE--------------------------------");
        fruits.forEach(System.out::println);
    }
}
