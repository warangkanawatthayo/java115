
public class Hw2Fibonacci {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		for (int i = 0; i <= 11; i++) {
		    sum = firstNum +secondNum;
		    firstNum = secondNum;
		    secondNum = sum;

		    System.out.print(firstNum+" ");

	}

}
}