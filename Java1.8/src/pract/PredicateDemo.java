package pract;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		 Predicate<Integer> p = i -> i > 10;
		 p.test(2);
	}

}
