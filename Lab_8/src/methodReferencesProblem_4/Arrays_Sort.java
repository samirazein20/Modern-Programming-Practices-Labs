package methodReferencesProblem_4;


import java.util.Arrays;
import java.util.List;

public class Arrays_Sort {
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        Arrays.sort(names, String::compareToIgnoreCase);
        List<String> liste = Arrays.asList(names);
        System.out.println("--------Result After Sort-----------"+liste);
    }

}
