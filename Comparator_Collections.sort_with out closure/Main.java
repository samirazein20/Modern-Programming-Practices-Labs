package problem_2.partAandB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static enum SortMethod {BYPRICE, BYTITLE};
    SortMethod method;

    public Main(SortMethod method) {

        this.method = method;
    }

    //sort method
    public void sort(List<Product> emps) {
        if(method == SortMethod.BYPRICE) {
            Collections.sort(emps, new PriceComparator());
        }
        else if(method == SortMethod.BYTITLE) {
            Collections.sort(emps, new TitleComparator());
        }
    }

    //
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Java", 100000, 1));
        product.add(new Product("JavaScript", 50000, 2));
        product.add(new Product("Algorithms", 60000, 3));
        product.add(new Product("Angular Js", 60000, 4));

        Collections.sort(product, new PriceComparator());
        System.out.println(product);

        System.out.println("---------------------------Now For Title Comparator------------------------");

        Collections.sort(product, new TitleComparator());
        System.out.println(product);


    }
}
