
public class Seat {
	private int count;
	private double price;
	private char type;
	
	Seat(int count, double price, char type) {
		this.count = count;
		this.price = price;
		this.type = type;
	}
	
	public int getCount() {
		return count;
	}

	public double getPrice() {
		return price;
	}
	
	public char getType() {
		return type;
	}
	
	public double getTotal() {
		return count*price;
	}
	
	
}

