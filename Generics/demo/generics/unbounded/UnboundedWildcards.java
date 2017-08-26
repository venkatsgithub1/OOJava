package demo.generics.unbounded;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		List<Double> dblList = new ArrayList<>();
		dblList.add(10.3);
		dblList.add(20.6);
		dblList.add(30.9);
		
		printList(intList);
		printList(dblList);
		
		List<String> f1Drivers = new ArrayList<>();
		f1Drivers.add("Seb");
		f1Drivers.add("Kimi");
		f1Drivers.add("Hamilton");
		f1Drivers.add("Bottas");
		
		printList(intList);
		printList(dblList);
		printList(f1Drivers);
	}
	
	public static void printList(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("!!!!!!!!");
	}
 }
