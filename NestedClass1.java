/**
 * 
 * An outer class to demonstrate how to use Nested Classes.
 * 
 * @author Venkat.
 *
 */
public class NestedClass1 {

	/**
	 * Main method is where the program execution starts.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		NestedClass1 nc1 = new NestedClass1();
		NestedClass1.Inner inner = nc1.new Inner();
		inner.print();

		Outer outer = new Outer();
		outer.logAMessage();
	}

	/**
	 * 
	 * A non static inner class with a void method that shall be used in main
	 * method of outer class.
	 * 
	 * @author Venkat.
	 *
	 */
	class Inner {
		/**
		 * A void method to be called from main method in outer class.
		 */
		public void print() {
			System.out.println("I am a method in the inner class");
		}
	}
}

/**
 * A foreign class created to access the inner class of the public class.
 * 
 * @author Venkat.
 *
 */
class Outer {
	/**
	 * The below code can be used in a method too. Used it straight away in a
	 * constructor so that on instantiation of the class inner class access can
	 * be seen.
	 */
	Outer() {
		NestedClass1 nc1 = new NestedClass1();
		NestedClass1.Inner innerInst = nc1.new Inner();
		innerInst.print();
	}

	/**
	 * A void method created to log a message.
	 */
	public void logAMessage() {
		System.out.println("I am able to access the inner class of another class :)");
	}
}
