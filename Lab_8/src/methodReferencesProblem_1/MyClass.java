package methodReferencesProblem_1;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyClass {

    boolean myMethod(MyClass cl){
        return myPredicate.test(cl);

    }
    Predicate<MyClass> myPredicate = (x) -> this.equals(x);
    public static void main(String[] args) {
        MyClass my = new MyClass();
        MyClass my1 = new MyClass();

        System.out.println(my.myMethod(my1));
        System.out.println(my.myMethod(my));
    }
}
