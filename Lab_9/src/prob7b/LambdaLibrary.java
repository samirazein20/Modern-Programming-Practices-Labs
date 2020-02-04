package prob7b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Character, Integer, String> EMPLOYEE_NAMES =
            (emps, c, salary) -> emps.stream()
                                                .filter((x) -> x.getSalary() > salary)
                                                .filter((x) -> x.getLastName().charAt(0)>c)
                                                .map(w -> w.getFirstName() + " " + w.getLastName())
                                                .sorted((str1,str2) -> str1.compareTo(str2)).collect(Collectors.joining(" ,"));

}
