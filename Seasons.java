//write the method called season
import java.util.Scanner;

public class Seasons {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the month number: ");
		int month = input.nextInt();
		System.out.print("Please enter the day number: ");
		int day = input.nextInt();
		System.out.println(season(month, day));
	}

	// Winter 12/16 to 3/15
	// Spring 3/16 to 6/15
	// Summer 6/16 to 9/15
	// Fall 9/16 to 12/15
	public static String season(int month, int day) {
		if (month < 3 || (month == 3 && day <= 15)) {
			return "Winter";
		} else if (month < 6 || (month == 6 && day <= 15)) {
			return "Spring";
		} else if (month < 9 || (month == 9 && day <= 15)) {
			return "Summer";
		} else if (month < 12 || (month == 12 && day <= 15)) {
			return "Fall";
		} else {
			return "Winter";
		}
	}
}
