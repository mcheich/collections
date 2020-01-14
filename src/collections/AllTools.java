package collections;

import java.util.ArrayList;

public class AllTools {

	public static void main(String[] args) {
		
		/**
		 * add
		 * clear
		 * set
		 * remove
		 */
		ArrayList<String> myLetters = new ArrayList<String>();
		myLetters.add("M");
		myLetters.add("k");
		myLetters.add("k");
		
		System.out.println(myLetters);
		
		myLetters.add(1,"i");
		
		System.out.println(myLetters);
		
		myLetters.set(3, "e");
		
		System.out.println(myLetters);
		
		myLetters.remove(0);
		
		System.out.println(myLetters);
		
		myLetters.clear();
		
		System.out.println(myLetters);

	}

}
