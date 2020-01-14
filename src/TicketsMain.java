
public interface TicketsMain {

	 static String eventOrt;
	   static String eventName;
	   static double basisPreis = 10.0;
	   double ticketPreis;

	   public TicketsMain (String ort, String name, double preis) {
		    eventOrt = ort;
		    eventName = name;
		    basisPreis = preis;
	   }   

	public abstract double berechneTicketpreis();
	   
	   public static void output() {
	      String text;
	      text  = "Eventort: " + eventOrt;
	      text += ", Eventname: " + eventName;
	      text += ", Preis: " + getTicketPreis() + " Euro";
	      System.out.println(text);
	      System.out.println(" ");
	   }

	public default double getTicketPreis() {
		return ticketPreis;
	}

	public default double setTicketPreis(double ticketPreis) {
		return this.ticketPreis = ticketPreis;
	}
}

