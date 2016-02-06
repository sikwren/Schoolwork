/*
 * Sydnee Wren
 * Due: July 24, 2015
 * 
 * Ticket.java
 * Write a superclass called Ticket, which has a constructor, 
 * a getPrice() method, and a toString. Write a subclass (Walk-up)
 * that give a 50 ticket cost. Write an addition subclasses 
 * (AdvanceTicket and StudentAdvanceTicket) that give additional
 * discounts to the price of a ticket depending on how early the
 * ticket is purchased in advance of the event. StudentAdvanceTickets
 * receive an additional discount.
 */
public class Ticket {
	private int number;
	private int ticketPrice;
	
	public Ticket (int number){
		this.number = number;
		ticketPrice = 50;
	}
	
	public int getPrice(){
		return ticketPrice;
	}
	
	public void setPrice(int price){
		ticketPrice = price;
	}
	
	public int getNumber(){
		return number;
	}
	
	public String toString(){
		return "Number: " + number + " Price: " + ticketPrice;
	}

}

class WalkupTicket extends Ticket{
	public WalkupTicket(int number){
		super(number);
	}
}

class AdvanceTicket extends Ticket{
	private int days;
	
	public AdvanceTicket(int number, int days){
		super(number);
		this.days = days;
		
		if (days >= 10){
			setPrice(getPrice()-20);
		} else {
			setPrice(getPrice()-10);
		}
	}

	public int getDays(){
		return days;
	}
}

class StudentAdvanceTicket extends AdvanceTicket {
	public StudentAdvanceTicket(int number, int days){
		super(number, days);	
		
		if (getDays() >= 10){
			setPrice(getPrice()/2);
		} else {
			setPrice(getPrice()/2);
		}
	}
	
	public String toString(){
		return "Number: " + getNumber() + " Price: " + 
					getPrice() + " (Student ID required)";
	}
}
