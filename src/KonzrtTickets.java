
public class KonzrtTickets implements TicketsMain {
	int konzertDauer;
	 
	   public KonzertTickets(String ort, String name, double preis, int dauer) {
	      super(ort, name, preis);
	      konzertDauer = dauer;
	      
	   }
	 
	   public double berechneTicketpreis()
	   {
	      setTicketPreis(basisPreis);
	 
	      if (konzertDauer > 120)
	      {
	         setTicketPreis(getTicketPreis() + 3);
	      }
	      return getTicketPreis();
	   }

}
