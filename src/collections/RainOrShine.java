package collections;

import java.util.ArrayList;

public class RainOrShine {

	public static void main(String[] args) {
		
		ArrayList<Boolean> myAL = new ArrayList<Boolean>();
		myAL.add(true);
		myAL.add(false);
		myAL.add(false);
		myAL.add(true);
		myAL.add(false);
		
		for(Boolean rain : myAL) {
			if(rain) {
				 System.out.println("Better bring an umbrella");
			} else {
				System.out.println("No rain today, enjoy the sun!");
			}
		}
	
	}

}
