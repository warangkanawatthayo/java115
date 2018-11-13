
public class Assignment6 {

	public static void main(String[] args) {
		double [] list1 = {16.1, 12.3, 22.2, 14.4};
		double [] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		
		if(isStored(list1))
			System.out.println("Listed1 is Stored: " + isStored(list1));
		else 
			System.out.println("Listed1 is not Stored: " + isStored(list1));
		
		if(isStored(list2))
			System.out.println("Listed2 is Stored: " + isStored(list2));
		else 
			System.out.println("Listed2 is not Stored: " + isStored(list2));

	}

	private static boolean isStored(double[] arr) {

		for(int i = 0; i<arr.length-1; i++ ) {
			if(arr[i+1]<arr[i])
				return false;
		}
		return true;
	}

}


