package sklep;

public class Phone {
	private int id;
	private String brand;
	private String model;
	private int cameraResolution;

	Phone(int id, String brand, String model, int cameraResolution) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.cameraResolution = cameraResolution;
	}
	int getId() {
		return this.id;
	}
	void showDetails() {
		System.out.println(this.toString());
		//System.out.println("marka: " + this.brand + " model: " + this.model + " rozdzielczoœæ aparatu: " + this.cameraResolution);
	}

	@Override
	public String toString() {
		return "marka: " + this.brand + " model: " + this.model + " rozdzielczoœæ aparatu: " + this.cameraResolution;
	}
	
}
