package prob3;

import java.util.*;
import java.util.stream.Stream;

public class Question3 {
    public static void main(String[] args) {
        List<String> wrds = new ArrayList<>();
        wrds.add("acccc");
        wrds.add("dgytt");
        wrds.add("catui");
        wrds.add("dogcu");
        wrds.add("zacui");
        wrds.add("samiop");

        System.out.println("Count is 3: "+countWords(wrds, 'c', 'd', 5));
    }

    public static int countWords (List<String> words, char c, char d, int len){

        int s = (int) words.stream().filter(w -> w.length() == len)
                                            .filter(w -> w.contains("c"))
                                            .filter(w -> !w.contains("d"))
                                            .count();

        return s;
    }
}
