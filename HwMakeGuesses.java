import java.util.Random;

public class HwMakeGuesses {

	public static void main(String[] args) {
		
			makeGuesses();

		}

		private static void makeGuesses() {
			Random randomNum = new Random();
			int numOfGuesses = 0;
			int totalGuesses = 0;

			do {
				numOfGuesses = randomNum.nextInt(50) + 1;
				System.out.println("guess = " + numOfGuesses);
				totalGuesses++;
			} while (numOfGuesses < 48);
			System.out.println("total guesses= " + totalGuesses);

		}

	}
