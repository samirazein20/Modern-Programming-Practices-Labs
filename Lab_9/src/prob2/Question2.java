package prob2;

import java.util.Optional;
import java.util.stream.Stream;

public class Question2 {

    public static Stream<Integer> myIntStream() {
        Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        return nums;
    }

    public static void main(String[] args) {
        //Maximum
        Optional<Integer> max =	myIntStream().max(Integer::compare);
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        //Minimum
        Optional<Integer>min = myIntStream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println(min.get());
        }


    }


}
