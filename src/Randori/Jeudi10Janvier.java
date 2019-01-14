package Randori;

import java.util.ArrayList;

/**
	 * Your goal in this kata is to implement an difference function, which subtracts one list from another.
	 * It should remove all values from list a, which are present in list b.
	 * difference([1,2],[1]) == [2]
	 * If a value is present in b, all of its occurrences must be removed from the other:
	 * difference([1,2,2,2,3],[2]) == [1,3]
	 * @author thibault
	 *
	 */
public class Jeudi10Janvier {
	
	public static ArrayList<Integer> Difference(int[] a, int[] b) {
		ArrayList<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < a.length ; i++) {
			if (a[i] != b[0]) {
				c.add(a[i]);
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[] tab1 = {1,2,2,3};
		int[] tab2 = {2};
		System.out.println(Difference(tab1, tab2));
	}

}
