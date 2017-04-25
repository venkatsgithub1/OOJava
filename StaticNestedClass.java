/**
 * 
 * A class created to demonstrate usage of static nested class.
 * 
 * @author Venkat.
 *
 */
public class StaticNestedClass {

	/**
	 * Main method starts the execution.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SomeOtherOuterClass someClass = new SomeOtherOuterClass();
		someClass.logAMessage();
	}

	/**
	 * The class is a static nested class of it's outer class.
	 * 
	 * @author Venkat.
	 *
	 */
	static class NestedChild {
		public void print() {
			System.out.println("I am a method inside static nested class.");
		}
	}
}

/**
 * A foreign class created to access the static nested class method of public
 * class.
 * 
 * @author Venkat.
 *
 */
class SomeOtherOuterClass {
	SomeOtherOuterClass() {
		StaticNestedClass.NestedChild s1 = new StaticNestedClass.NestedChild();
		s1.print();
	}

	/**
	 * A void method to print a message.
	 */
	public void logAMessage() {
		System.out.println("I know I can access the static inner class.");
	}
}
