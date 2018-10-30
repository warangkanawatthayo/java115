package midtermProject;

import java.util.Random;

public class Walks {

	public static void main(String[] args) {

		int steps = 0;
		int max = steps;
		for (int i = 0 ; i <= 3 ; i ++) {
			steps += randomWalk();
			//after increase / decrease each step, check the current step and max step and keep it. 
			while (max == 3)
				max = steps;
			System.out.println("position" + i + " = " + steps);
		}
		System.out.println("max position = " + max);
	}
	
	public static int randomWalk() {
		Random rand = new Random();
				int number = rand.nextInt(2);

		if (number == 1) {
			//if number == 1 then decrease one step
			return -1;
		}
		//if number == 2 then increase one step
		return 1;
	}
}
