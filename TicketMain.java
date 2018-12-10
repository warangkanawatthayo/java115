// client for Ticket class

public class TicketMain {

	public static void main(String[] args) {
		WalkUpTicket tk1 = new WalkUpTicket(1);
		AdvanceTicket tk2 = new AdvanceTicket(2, 15);
		AdvanceTicket tk3 = new AdvanceTicket(3, 3);
		StudentAdvanceTicket tk4 = new StudentAdvanceTicket(4, 18);
		StudentAdvanceTicket tk5 = new StudentAdvanceTicket(5, 1);
		
		
		System.out.println(tk1);
		System.out.println(tk2);
		System.out.println(tk3);
		System.out.println(tk4);
		System.out.println(tk5);
		

	}

}
