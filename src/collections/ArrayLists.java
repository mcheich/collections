package collections;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> myAL = new ArrayList<String>();
		myAL.add("Fox");
		myAL.add("Bat");
		myAL.add("Toad");
		myAL.add("Frog");
		myAL.add("Dog");
		
		for(String animal : myAL) {
			System.out.println(animal);
		}

	}

}
