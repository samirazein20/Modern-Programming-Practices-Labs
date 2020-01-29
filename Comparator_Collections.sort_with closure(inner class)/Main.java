package problem_2.partC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static enum SortMethod {BYPRICE, BYTITLE};
    private SortMethod sortMethod;

    public void sort(List<Product> pdts, final SortMethod method) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product o1, Product o2) {
                if(method == SortMethod.BYTITLE) {
                    return o1.title.compareTo(o2.title);
                } else {
                    if(o1.price == o2.price) return 0;
                    else if(o1.price < o2.price) return -1;
                    else return 1;
                }
            }
        }
        Collections.sort(pdts, new ProductComparator());
    }
    //
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Java", 100000, 1));
        product.add(new Product("JavaScript", 50000, 2));
        product.add(new Product("Algorithms", 60000, 3));
        product.add(new Product("Angular Js", 60000, 4));

        Main ma = new Main();
        ma.sort(product, Main.SortMethod.BYTITLE);
        System.out.println(product);
        //same instance
        System.out.println("---------------------------Now For Price Comparator------------------------");

        ma.sort(product, Main.SortMethod.BYPRICE);
        System.out.println(product);

    }
}
