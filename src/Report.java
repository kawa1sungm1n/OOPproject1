
public class Report {
	
	// set Array 
	// seats[] array
	Seat seats[] = new Seat[3];
	
	Report(Seat a, Seat b, Seat c) {
		// Save Seat a, Seat b, Seat c into seats[]
		// When user use this with getter(), can get information
		seats[0] = a;
		seats[1] = b;
		seats[2] = c;
	}
	
	@Override
	public String toString() {
		// Setting Report Area
		return String.format("%22s%13s%11s", "Tickets sold", "Price", "Total") + "\n" +			// %s for String,  %d for integer,  %f for Decimal
				String.format("%22s%13s%11s", "------------", "-----", "-----") + "\n" +		// \n is "new line"
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat A", seats[0].getCount(), "$", seats[0].getPrice(),"$",seats[0].getTotal()) + "\n" +
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat B", seats[1].getCount(), "$", seats[1].getPrice(),"$",seats[1].getTotal()) + "\n" +
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat C", seats[2].getCount(), "$", seats[2].getPrice(),"$",seats[2].getTotal()) + "\n" +
				String.format("%s", "") + "\n" +	// Empty line
				String.format("%s%1s%.2f", "Total Sales: ","$ ", seats[0].getTotal()+seats[1].getTotal()+seats[2].getTotal());	// Total of whole sales
		
	}
}
