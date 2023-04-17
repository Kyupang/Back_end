package 컬렉션;

import java.util.*;
import java.util.HashSet;

public class Iterator {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<Integer>();
		Integer[] money = {1000,2000,3000,2000,4000,2000,3000};
		
		for(int x : money) {
			bag.add(x);
		}
		
		java.util.Iterator<Integer> it = bag.iterator();
		for(int i=0; i< bag.size(); i++) {
			System.out.println(it.next());
		}
		System.out.println(bag);
	}

}
