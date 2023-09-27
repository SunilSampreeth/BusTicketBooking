package com.jsp;

public class BusTicketImpl implements BusTicket {
	
	private int totalUpperticket;
	private int totalLowerticket;
	
	
	public BusTicketImpl(int totalUpperticket, int totalLowerticket) {
		
		this.totalUpperticket = totalUpperticket;
		this.totalLowerticket = totalLowerticket;
	}

	@Override
	public void bookUpperTicket(int ticket) {
		if(totalUpperticket >= ticket) {
		System.out.println("Enter Upper Ticket");
		totalUpperticket = totalUpperticket- ticket;
		System.out.println("Book ticket successfully");
	}
	
	else {
		System.out.println("Insufficient ticket");
	}
		}
	@Override
	public void bookLowerTicket(int ticket) {
		System.out.println("Enter Lower Ticket");
		totalLowerticket = totalLowerticket- ticket;
		System.out.println("Book ticket successfully");

	}

	@Override
	public void cancelUpperTicket(int ticket) {
		System.out.println("Enter Upper Ticket");
		totalUpperticket = totalUpperticket+ ticket;
		System.out.println("Book ticket successfully");

	}

	@Override
	public void cancelLowerTicket(int ticket) {
		System.out.println("Enter lower Ticket");
		totalLowerticket = totalLowerticket + ticket;
		System.out.println("Book ticket successfully");

	}

	@Override
	public int viewUpperTicket() {
		return totalUpperticket;
	}

	@Override
	public int viewLowerTicket() {
		return totalLowerticket;
	}

	@Override
	public String displayErrorMessage() {
		return "Invalid choice";
	}

}
