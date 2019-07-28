package demo.generics.comparator;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {
	private final Comparator<T> comparator;

	public ReverseComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	@Override
	public int compare(T one, T other) {
		return -1 * this.comparator.compare(one, other);
	}
}
