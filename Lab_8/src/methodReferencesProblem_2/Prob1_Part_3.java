package methodReferencesProblem_2;

import java.util.Random;
import java.util.function.Supplier;

public class Prob1_Part_3 {

    static class MyInnerClass implements Supplier {
        @Override
        public Object get() {
            Random r = new Random();
            return r.nextInt();
        }
    }

    public static void main(String[] args) {

        MyInnerClass myInner = new MyInnerClass();
        System.out.println(myInner.get());
    }

}
