package problem_1;

import java.util.function.BiFunction;

public class Problem_1 {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> ex = (x, y) -> Math.pow(x,y);
        Double result = ex.apply(10.0, 2.0);
        System.out.println("Result : "+result);

//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        list.add(2);
//        System.out.println(myPredicate.test(list, 9));
//        System.out.println(myPredicate.test(list, 1));

    }

//    BiFunction<Integer, Integer, Boolean> myfunction = (x, y) -> x*x == y;
//
//    static BiPredicate<List<Integer>, Integer> myPredicate = (list, element) -> list.contains(element);
}
