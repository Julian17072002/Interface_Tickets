
public  class KonzrtTickets implements TicketsMain {
	private String eventLocation;
	private String eventName;
	private String date;
	private double basicPrice;
	private double ticketPrice;
	
	public KonzrtTickets(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		berechneTicketpreis();
	}
	public KonzrtTickets(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 100);
	}
	public KonzrtTickets(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 100);
	}
	public KonzrtTickets(String eventLocation) {
		this(eventLocation, "Event Name", "01.01.2020", 100);
	}
	public KonzrtTickets() {
		this("Event Location", "Event Name", "01.01.2020", 100);
	}
	
	public double berechneTicketpreis() {
		if (getEventLocation() == "VAZ Hafen") {
			return (getBasicPrice() * 0.75);
		}
		else if (getEventLocation() == "Zenith Kulturh.") {
			return (getBasicPrice() * 1.25);
		}
		else {
			return (getBasicPrice());
		}
	}
	
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public double setTicketPrice(double ticketPrice) {
		return this.ticketPrice = ticketPrice;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void output() {
		System.out.println();
		System.out.println("+---------------------------Ticketausgabe---------------------+");
		System.out.println("|\t\t"+eventLocation+"\t\t\t|             |");
		System.out.println("|\t\t"+eventName+"\t\t\t|             |");
		System.out.println("+-----------------------+-----------------------+             |");
		System.out.println("|\t"+date+"\t|\t"+ticketPrice+" €\t\t|             |");
		System.out.println("+-----------------------------------------------^-------------+");
	}
}