package demo.generics.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

		Collections.sort(personList, new ReverseComparatorClass<>(new AgeComparator()));
		System.out.println("Descending order by age");
		System.out.println(personList);

		System.out.println(min(personList, new AgeComparator()));
	}

	/**
	 * The method is used to determine
	 * a minimum value from the list of
	 * values.
	 * 
	 * @param listVals
	 * @param comparator
	 * @return
	 */
	public static <T> Object min(List<T> listVals, Comparator<T> comparator) {
		if (listVals.isEmpty()) {
			throw new IllegalArgumentException("List is empty");
		}
		T lowest = listVals.get(0);
		T element = null;
		for (int i = 1; i < listVals.size(); i++) {
			element = listVals.get(i);
			if (comparator.compare(element, lowest) < 0)
				lowest = element;
		}
		return lowest;
	}
}
