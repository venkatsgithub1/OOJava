package demo.generics.comparator;

public class Person {
	private int age;
	private String name;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person-->(age:" + this.age + ",name:" + this.name + ")";
	}
}
