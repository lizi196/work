package work8;

public class Books {
	private String id;
	private String name;
	private double price;
	private String press;
	
	Books(String id, String name, double price, String press) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.press = press;
	}
	
	String getId() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	double getPrice() {
		return price;
	}
	
	String getPress() {
		return press;
	}

}
