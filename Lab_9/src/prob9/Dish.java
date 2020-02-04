package prob9;
import java.util.*;
import java.util.function.Predicate;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));

    //part A
    public static boolean vegMealAvailable(){
        Predicate<Dish> p1 = s -> s.isVegetarian() == true;
        boolean res = menu.stream().anyMatch(p1);
        return res;
    }

    //part B
    public static boolean healthyMenu(){
        Predicate<Dish> healthy = s -> s.getCalories() < 1000;
        boolean result = menu.stream().anyMatch(healthy);
        return result;
    }

    //part C
    public static boolean unHealthyMenu(){
        Predicate<Dish> unHealthy = u -> u.getCalories() > 1000;
        boolean result = menu.stream().anyMatch(unHealthy);
        return result;
    }

    //part D
    public static Optional<Dish> firstItemOfMeat(){
        Optional<Dish> firstItem = menu.stream().filter((r) -> r.getType().equals(Type.MEAT)).findFirst();
        return firstItem;
    }

    //part E
    public static int TotalCalories(){
        int caloriesCount = menu.stream().map(dish->dish.getCalories()).reduce(0, (v1,v2)->v1 + v2);
        return caloriesCount;
    }

    //part F
    public static int TotalCaloriesMethodReferences(){
        int methodReferenceCaloriesCount = menu.stream().map(Dish::getCalories).reduce(0, Integer::sum);
        return methodReferenceCaloriesCount;
    }

    //part G
    public static void main(String[] args) {

        System.out.println("Query A -> Is Vegetable Available : " + vegMealAvailable ());
        System.out.println("Query B -> Healthy Menu : " + healthyMenu());
        System.out.println("Query C -> Un Healthy Menu : " + unHealthyMenu());
        System.out.println("Query D -> First Item Of Meat : " + firstItemOfMeat());
        System.out.println("Query E -> Total Calories : " + TotalCalories ());
        System.out.println("Query F -> Total Calories Method Reference : " + TotalCaloriesMethodReferences ());
    }

}