package collections;

import java.util.ArrayList;

public class WhichOnes {

	public static void main(String[] args) {
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		int[] numArray = {1, 23, 9, 77, 922, 6, 32, 63, 14, 5};
		
		for(int i = 0; i < numArray.length;i++) {
			myNums.add(numArray[i]);
		}
		System.out.println("myNums" + myNums);
		
		displayResult(myNums, 23);
		displayResult(myNums, 77);
		displayResult(myNums, 15);
		
		myNums.remove(new Integer(23));
		myNums.remove(new Integer(922));
		myNums.remove(new Integer(32));
		myNums.remove(new Integer(6));
	
		System.out.println("myNums" + myNums);
		
		displayResult(myNums, 23);
		displayResult(myNums, 77);
		displayResult(myNums, 15);
	}
	
	public static void displayResult(ArrayList<Integer> AL, int num) {
		
		if(AL.contains(num)) {
			System.out.println("This ArrayList contains " + num );
		} else {
			System.out.println("This ArrayList DOES NOT contain " + num );	
		}
	}

}
