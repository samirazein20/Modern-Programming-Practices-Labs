package problem_2;

import java.util.Comparator;
import java.util.List;

public class SecondSmallest {
    public static <T extends Object & Comparable<? super T>> T second(List<T> list){
        T min = list.get(Integer.MAX_VALUE);
        T secondMin = list.get(Integer.MAX_VALUE);
        for (int i = 0; i<list.size(); i++){
            if (min.equals(list.get(i))){
                secondMin = min;
            }else if (list.get(i).compareTo(min) < 0){
                secondMin = min;
                min = list.get(i);
            }else if (list.get(i).compareTo(secondMin)<0){
                secondMin = list.get(i);
            }
        }
        return secondMin;
    }
}
