
public class HwPowersOfN {

	public static void main(String[] args) {
		printPowersOfN(4, 3);
		System.out.println();
		printPowersOfN(5, 6);
		System.out.println();
		printPowersOfN(-2, 8);

	}

	public static void printPowersOfN(int base, int exponent) {
		for (int i = 0; i <= exponent; i++)
			System.out.print(((int) Math.pow(base, i)) + "  ");

	}

}