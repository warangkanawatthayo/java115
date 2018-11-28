public class ProductMain {

	public static void main(String[] args) {
		
		//to assign the value of products
		
		Product p1 = new Product("C_9999"," Cheery ", 89);
		Product p2 = new Product("A_7777", " Apple ", 69);
		Product p3 = new Product("K_5555", " Kiwi ", 93);
		Product p4 = new Product("P_8888", " Plum ", 49);
		Product p5 = new Product("P_3333", " Pear ", 59);
					
		//to display output
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		
		System.out.println();
		
		//to count the number of products
		
		System.out.println("Product Count: " + p1.getCount());
	}		

}
