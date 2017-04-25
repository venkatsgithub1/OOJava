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
