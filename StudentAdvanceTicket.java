
public class StudentAdvanceTicket extends Ticket {

	private double price;
	private int purchaseDate;
	
	public StudentAdvanceTicket(int Idnumber, int purchaseDate) {
		super(Idnumber);
		this.purchaseDate = purchaseDate;
	}

	@Override
	public double getPrice() {
		if(purchaseDate >= 10) {
			price = 15.0;
			return price;
		}
		
		else {
			price = 20.0;
			return price;
		}
	}
	
}
