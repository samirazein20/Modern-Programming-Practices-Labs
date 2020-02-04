package prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num){
        List<Integer> ints = IntStream.iterate(1, n -> n + 1).map(n -> n * n)
                                            .limit(num).boxed()
                                            .collect(Collectors.toList());
        System.out.println(ints);
    }

}
