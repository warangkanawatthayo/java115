
public class BankAccountMain1 {

	public static void main(String[] args) {
		
		BankAccount1 Yana = new BankAccount1("Yana", 100.00, 5.50);
		
		Yana.deposit(50.00);
		System.out.println(Yana.balance);
		System.out.println(Yana.toString());
		System.out.println();
		
		Yana.withdraw(200.00);
		System.out.println(Yana.balance);
		System.out.println(Yana.toString());
		System.out.println();
		
		Yana.withdraw(73.00);
		System.out.println(Yana.balance);
		System.out.println(Yana.toString());
		System.out.println();
		
		Yana.deposit(120.00);
		System.out.println(Yana.balance);
		System.out.println(Yana.toString());
		
	}

}
