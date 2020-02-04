package prob7a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here

		Stream<String> streams = list.stream().filter((x) -> x.getSalary() > 100000)
												.filter((x) -> x.getLastName().charAt(0)>'M')
												.map(w -> w.getFirstName() + " " + w.getLastName())
												.sorted((str1,str2) -> str1.compareTo(str2));
		String s = streams.collect(Collectors.joining(" ,"));
		System.out.println(s);
	}


}
