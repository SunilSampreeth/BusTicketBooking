package com.jsp;

public interface BusTicket {
	void bookUpperTicket(int ticket);
	void bookLowerTicket(int ticket);
	void cancelUpperTicket(int ticket);
	void cancelLowerTicket(int ticket);
	int viewUpperTicket();
	int viewLowerTicket();
	String displayErrorMessage();
	
}


