
public interface TicketsMain {
	
	void setEventLocation(String eventLocation);
	String getEventLocation();
	
	void setEventName(String eventName);
	String getEventName();
	
	void setDate(String date);
	String getDate();
	
	void setBasicPrice(double basicPrice);
	double getBasicPrice();
	
	double setTicketPrice(double ticketPrice);
	double getTicketPrice();
	
	void output();
	
	double berechneTicketpreis();

}

