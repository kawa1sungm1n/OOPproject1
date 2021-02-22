
public class Report {
	
	Seat seats[] = new Seat[3];

	
	Report(Seat a, Seat b, Seat c) {
		seats[0] = a;
		seats[1] = b;
		seats[2] = c;
	}
	

	@Override
	public String toString() {
		return String.format("%22s%13s%11s", "Tickets sold", "Price", "Total") + "\n" +
				String.format("%22s%13s%11s", "------------", "-----", "-----") + "\n" +
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat A", seats[0].getCount(), "$", seats[0].getPrice(),"$",seats[0].getTotal()) + "\n" +
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat B", seats[1].getCount(), "$", seats[1].getPrice(),"$",seats[1].getTotal()) + "\n" +
				String.format("%s%7d%18s%.2f%6s%.2f", "Seat C", seats[2].getCount(), "$", seats[2].getPrice(),"$",seats[2].getTotal()) + "\n" +
				String.format("%s", "") + "\n" +
				String.format("%s%1s%.2f", "Total Sales: ","$ ", seats[0].getTotal()+seats[1].getTotal()+seats[2].getTotal());
		
	}
}
