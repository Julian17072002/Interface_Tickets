
public class Tickets {
	
	 public static void main (String[] args) {

		  	Sporttickets st1 = new Sporttickets("Barcelona", "BAR-RM", "13.04.2020", 100);
			KonzrtTickets ct1 = new KonzrtTickets("Innsbruck", "J_S_Bach Goldbergvariation", "26.01.2020", 200);
			TheaterTickets tt1 = new TheaterTickets("Wien", "Romeo_und_Julia", "10.03.2020", 20);
			TicketShop.bestellen(st1);
			TicketShop.bestellen(ct1);
			TicketShop.bestellen(tt1);
			  System.out.println("------------Tickets_Ausgabe-------------");
			  System.out.println("Anzahl der verfügbaren Tickets: "+TicketShop.getAnzahlTickets());
			  System.out.println("Günstigstes verfügbare Ticket: "+TicketShop.getGuenstigstesTicket());
			  System.out.println("Teuerste verfügbare Ticket: "+TicketShop.getTeuerstesTicket());
	}		
}

