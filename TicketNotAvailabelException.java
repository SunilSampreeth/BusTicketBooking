package com.jsp;

public class TicketNotAvailabelException extends RuntimeException{
	private String message;
	
	TicketNotAvailabelException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

}
