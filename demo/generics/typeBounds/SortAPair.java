package demo.generics.typeBounds;

public class SortAPair<T extends Comparable<T>> {
	private final T first;
	private final T second;

	public SortAPair(T first, T second) {
		if (first.compareTo(second) < 0) {
			this.first = first;
			this.second = second;
		} else {
			this.first = second;
			this.second = first;
		}
	}

	public T getFirst() {
		return this.first;
	}

	public T getSecond() {
		return this.second;
	}
}
