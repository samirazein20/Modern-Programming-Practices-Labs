package prob10;

import prob7b.TriFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {

	public static Stream<Human> humanStream(Human[] list) {
		return Stream.of(list);
	}

public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	//Stream<Human> females = Stream.of(list).filter((x) -> x.gender.equalsIgnoreCase("Female")).map(f -> f.name ).;
	humanStream(list).filter(human -> human.getGender().equalsIgnoreCase("Female"))
			.forEach(human -> System.out.println(human.getName()));

    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status
	System.out.println("------------------First Constructor-----------------------");
	Function<String, Human> firstFunction = Human::new;
	firstFunction.apply("Joe");
	firstFunction.apply("Jane");
	firstFunction.apply("John");
	System.out.println(firstFunction);

	System.out.println("------------------Second Constructor-----------------------");
	BiFunction<String, Integer,Human> secondFunction = Human::new;
	secondFunction.apply("Joe", 35);
	secondFunction.apply("Jane", 45);
	secondFunction.apply("John", 30);
	System.out.println(secondFunction);

	System.out.println("------------------Third Constructor-----------------------");
	TriFunction<String, Integer,String, Human> thirdFunction = Human::new;
	thirdFunction.apply("Joe", 35,"Male");
	thirdFunction.apply("Jane", 45,"Female");
	thirdFunction.apply("John", 30,"Male");
	System.out.println(thirdFunction);

	// Query 3 : Count the male candidates whose age is more than 30

	humanStream(list).filter(h -> h.getGender().equalsIgnoreCase("Male"))
						.filter(y -> y.getAge() > 30).count();

    
   }



}
