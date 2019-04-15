package sklep;

public class Tv {
	private int id;
	private String brand;
	private String model;
	private int resolution;
	
	Tv (int id,String brand, String model,int resolution)
	{
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.resolution = resolution;
	}
	void showDetails() {
		System.out.println("marka TV: " + this.brand + " model: "+ this.model + " przek¹tna: "+ this.resolution + " cali");
	}
	int getId() {
		return this.id;
	}
	
	public String toString() {
		return "marka TV: " + this.brand + " model: "+ this.model + " przek¹tna: "+ this.resolution + " cali";
	}
}
