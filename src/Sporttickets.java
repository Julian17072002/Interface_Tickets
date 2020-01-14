
public class Sporttickets implements TicketsMain{


	 int finalStufe;
	 
	   public SportTickets(String ort, String name, double preis, int stufe) {
	      super(ort, name, preis);
	      finalStufe = stufe;
	   
	   }
	 
	   public double berechneTicketpreis() {
	      setTicketPreis(basisPreis + (10 * finalStufe));   
	      return getTicketPreis();
	   }
}
