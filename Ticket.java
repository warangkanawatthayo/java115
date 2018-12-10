//Assignment 9
//4th Edition of textbook p. 657 Exercise 5 and 6 (Ticket class for campus event)

//Ticket: Superclass


public abstract class Ticket {
	private int Idnumber;
	
	public Ticket(int Idnumber) {
		this.Idnumber = Idnumber;
	}

	public abstract double getPrice();

	public String toString() {
		String printout = "Number: " + Idnumber + ", Price: " + getPrice();
		return printout;
	}

}
