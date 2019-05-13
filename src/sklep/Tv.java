package sklep;

public class Tv {
	private int id;
	private String brand;
	private String model;
	private int resolution;
	private int price;
	
	Tv (int id,String brand, String model,int resolution, int price)
	{
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.resolution = resolution;
		this.price = price;
	}
	void showDetails() {
		System.out.println(this.toString());
//		System.out.println("marka TV: " + this.brand + " model: "+ this.model + " przekątna: "+ this.resolution + " cali "  + "cena: "+ this.price);
	}
	int getId() {
		return this.id;
	}
	int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "marka TV: " + this.brand + " model: "+ this.model + " przekątna: "+ this.resolution + " cali" + ", cena: "+ this.price;
	}
	
}
