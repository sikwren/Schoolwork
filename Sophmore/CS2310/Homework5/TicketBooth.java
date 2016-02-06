import java.util.*;
/*
 * Sydnee Wren
 * Due: July 24, 2015
 * 
 * The Homework said nothing about writing a client program,
 * but I wrote one any way, just in case, and to show that all
 * subclasses run properly.
 */
public class TicketBooth {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);


		System.out.println("Walkup Ticket: ");
		WalkupTicket t1 = new WalkupTicket(1);
		System.out.println(t1);
		
		System.out.print("How many days in advance is this advance ticket being purchased: ");
		int days = in.nextInt();
		AdvanceTicket t2 = new AdvanceTicket(2, days);
		System.out.println(t2);

		System.out.print("How many days in advance is this student ticket being purchased: ");
		days = in.nextInt();
		StudentAdvanceTicket t3 = new StudentAdvanceTicket(3, days);
		System.out.println(t3);

		in.close();
	}
}
