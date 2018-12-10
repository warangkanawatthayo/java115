// To represent a walk-up ticket which is purchased on the event day 

public class WalkUpTicket extends Ticket {

	private double price = 50.00;
	public WalkUpTicket(int Idnumber) {
		super(Idnumber);
		
	}

	@Override
	public double getPrice() {
		return price;
	}
	
}
