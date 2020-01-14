import java.util.ArrayList;

public class TicketsShop {

	ArrayList<TicketsMain> ticketList = new ArrayList <TicketsMain>();
	
	public static void main(String[] args) {

	}
	
	public void bestellen(TicketsMain t)
	{
		ticketList.add(t);
	}
	public int getAnzahlTickets()
	{
		return ticketList.size();
	}
	
	public double getGuenstigstesTicket()
	{
		double günstigstes = 1000.0;
		for(int i=0;i<ticketList.size();i++)
		{
			if(ticketList.get(i).berechneTicketpreis()<günstigstes)
			{
				günstigstes = ticketList.get(i).berechneTicketpreis();
			}
		}
		return günstigstes;
	}
	
	public double getTeuerstesTicket()
	{
		double teuerstes = 0.0;
		for(int i=0;i<ticketList.size();i++)
		{
			if(ticketList.get(i).berechneTicketpreis()>teuerstes)
			{
				teuerstes = ticketList.get(i).berechneTicketpreis();
			}
		}
		return teuerstes;
	}
}