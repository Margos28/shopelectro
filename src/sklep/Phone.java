package sklep;

public class Phone {
	private int id;
	private String brand;
	private String model;
	private int cameraResolution;
	private int price;

	Phone(int id, String brand, String model, int cameraResolution, int price) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cameraResolution = cameraResolution;
		this.price = price;
	}
	int getId() {
		return this.id;
	}

	int getPrice() {
		return this.price;
	}
	void showDetails() {
		System.out.println(this.toString());
		//System.out.println("marka: " + this.brand + " model: " + this.model + " rozdzielczość aparatu: " + this.cameraResolution);
	}

	@Override
	public String toString() {
		return "marka: " + this.brand + " model: " + this.model + " rozdzielczość aparatu: " + this.cameraResolution + "  cena: "+ this.price ;
	}
	
	
}
