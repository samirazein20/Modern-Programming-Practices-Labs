package problem_3;

import java.util.Arrays;
import java.util.List;

public class ContainsGeneralization {

    public static <T> boolean contains2(List<T> list1, T s1){
        for (T x : list1){
            if (x == null && s1 == null) return true;
            if(s1 == null || x == null) continue;

           if (x.equals(s1)) return true;
        }
        return false;
    }

    public static void test1(){
        List<String> list = Arrays.asList("Bob", "Joe", "Tom");
        boolean result1 = ContainsGeneralization.contains2(list, "Sam");
        System.out.println(result1);
    }

    public static void main(String[] args) {
        test1();
    }

}
