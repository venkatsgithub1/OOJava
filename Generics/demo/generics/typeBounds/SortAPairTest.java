package demo.generics.typeBounds;

public class SortAPairTest {

	public static void main(String[] args) {
		SortAPair<Integer> pair1 = new SortAPair<>(1, 2);
		SortAPair<Integer> pair1Rev = new SortAPair<>(2, 1);

		System.out.println("First Element " + pair1.getFirst() + " | Second Element " + pair1.getSecond());
		System.out.println("First Element " + pair1Rev.getFirst() + " | Second Element " + pair1Rev.getSecond());
	}
}
