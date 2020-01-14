
public class Tickets {
	
	 public static void main (String[] args) {
		 Sporttickets st1 = new Sporttickets("Barcelona", "BAR-RM", 120, 10);
			st1.output();
	
			KonzrtTickets ct1 = new KonzrtTickets("Innsbruck", "J_S_Bach Goldbergvariation", 100, 200);
			ct1.output();
			
			TheaterTickets tt1 = new TheaterTickets("Wien", "Romeo_und_Julia", 50, 20);
			tt1.output();
	  
		  TicketShop shop = new TicketShop();
		  shop.bestellen(st1);
		  shop.bestellen(ct1);
		  shop.bestellen(tt1);
		  System.out.println("Anzahl der verfügbaren Tickets: "+shop.getAnzahlTickets());
		  System.out.println("Günstigstes verfügbare Ticket: "+shop.getGuenstigstesTicket());
		  System.out.println("Teuerste verfügbare Ticket: "+shop.getTeuerstesTicket());
	  }
}
