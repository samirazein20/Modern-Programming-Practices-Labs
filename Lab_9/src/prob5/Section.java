package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Section {
    public static Stream<String> streamSection(Stream<String> stream, int m, int n){
        return stream.skip(m).limit(n-m+1);
    }

    public static void main(String[] args) {

        System.out.println(streamSection(nextStream(), 0, 7).collect(Collectors.joining(", ")));
        System.out.println(streamSection(nextStream(), 2, 8).collect(Collectors.joining(", ")));
    }

    private static Stream<String> nextStream(){
        return Arrays.asList("aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii").stream();
    }
}
