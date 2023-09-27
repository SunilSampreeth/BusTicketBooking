package com.jsp;

import java.util.Scanner;


public class Solution {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BusTicket bus= new BusTicketImpl(50,50);
		
		while(true) {
			System.out.println("1.Book Upper Ticket\n2.Book Lower Ticket\n3.Cancel Upper Ticket\n4.Cancel Lower"
					+ " Ticket\n5.View Upper Ticket\n6.View Lower Ticket\n7.EXIT");
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			
			switch(choice){
			case 1: 
				System.out.println("booking Ticket is");
				bus.bookUpperTicket(sc.nextInt());
				break;
			case 2: 
				System.out.println("booking Ticket is");
				bus.bookLowerTicket(sc.nextInt());
				break;
			case 3: 
				System.out.println("Cancel Ticket is");
				bus.cancelUpperTicket(sc.nextInt());
				break;
			case 4: 
				System.out.println("Cancel Ticket is");
				bus.cancelLowerTicket(sc.nextInt());
				break;
			case 5: 
				System.out.println("Availabel Upper Ticket is :"+bus.viewUpperTicket());
				break;
			case 6: 
				System.out.println("Availabel Lower Ticket is :"+bus.viewUpperTicket());
				break;
				
			case 7:
				System.out.println("thank you");
				System.exit(0);
				
			default:
				System.out.println(bus.displayErrorMessage());
				
			}
			System.out.println("--------------------------");
			
		}
}
}