// To represents a ticket which is purchased in advance
// Purchased 10+ days before event: $30
// Purchased <10 days before event: $40

public class AdvanceTicket extends Ticket {

	private double price;
	private int purchaseDate;
	
	
	public AdvanceTicket(int Idnumber, int purchaseDate) {
		super(Idnumber);
		this.purchaseDate = purchaseDate;
	}

	@Override
	public double getPrice() {
		if(purchaseDate >= 10) {
			price = 30.00;
			return price;
		}
		else {
			price = 40.00;
			return price;
		}
	
	}
	
}
