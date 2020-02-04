package prob6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question6 {
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<String>();
        hSet.add("A");
        hSet.add("B");
        hSet.add("D");
        hSet.add("1");
        hSet.add("3");
        hSet.add("5");

        List<Set<String>> l = new ArrayList<>();
        l.add(hSet);

        union(l);
    }

    public static Set<String> union (List<Set<String>> sets){
        int n = sets.size();
        Stream<String> setString = sets.stream().flatMap(s -> s.stream());

        Set<String> set1 = setString.collect(Collectors.toSet());
        System.out.println(set1);
        return set1;
    }

}
