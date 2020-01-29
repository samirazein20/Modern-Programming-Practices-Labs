package problem_2.partD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static enum SortMethod {BYTITLE, BYMODEL};
    private SortMethod sortMethod;

    public void sort(List<Product> pdts, SortMethod method) {
        Collections.sort(pdts, (o1,o2) -> {
                if(method == SortMethod.BYTITLE) {
                    return o1.title.compareTo(o2.title);
                } else {
                    if(o1.model == o2.model) return 0;
                    else if(o1.model < o2.model) return -1;
                    else return 1;
                }

        });
    }

    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Java", 100000, 1));
        product.add(new Product("JavaScript", 50000, 2));
        product.add(new Product("Algorithms", 60000, 3));
        product.add(new Product("Angular Js", 60000, 4));

        Main ma = new Main();
        ma.sort(product, Main.SortMethod.BYTITLE);
        System.out.println(product);

        System.out.println("---------------------------Now For Model Comparator------------------------");

        ma.sort(product, SortMethod.BYMODEL);
        System.out.println(product);


    }
}
