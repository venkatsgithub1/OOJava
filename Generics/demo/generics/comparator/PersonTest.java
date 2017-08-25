package demo.generics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Seb", 30));
		personList.add(new Person("Kimi", 37));
		personList.add(new Person("Lewis", 32));
		personList.add(new Person("Valtteri", 27));
		personList.add(new Person("Daniel Ric", 28));
		personList.add(new Person("Max", 19));

		System.out.println("Before sort");
		System.out.println(personList);

		Collections.sort(personList, new AgeComparator());

		System.out.println("After sort");
		System.out.println(personList);
	}
}
