package prioridad;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioridad {
	public static void main(String[] args) {
		Comparator<Personal> comparator = new Comparator<Personal>() {

			@Override
			public int compare(Personal o1, Personal o2) {
				// mecqanismo de comparacion como el comparable
				return o1.priority - o2.priority;
			}
		};
		PriorityQueue<Personal> pro = new PriorityQueue<>(comparator);
		pro.add(new Personal("aa", 1));
		pro.add(new Personal("ba", 2));
		pro.add(new Personal("ca", 3));
		pro.add(new Personal("ab", 1));
		pro.add(new Personal("ac", 1));
		System.out.println(pro);
		while (!pro.isEmpty()) {
			System.out.print(pro.poll() + " ");
		}

	}
}
