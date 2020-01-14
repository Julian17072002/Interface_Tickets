
public class TheaterTickets  implements TicketsMain {

	int sitzReihe;
	   public void TheatherTickets(String ort, String name, double preis, int reihe) {
	      super(ort, name, preis);
	      reihe = sitzReihe;
	     
	   }
	 
	   public double berechneTicketpreis() {
	      setTicketPreis(basisPreis * sitzReihe);
	      return setTicketPreis(5);
	   }

}
