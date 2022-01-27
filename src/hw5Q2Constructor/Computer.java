package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default constructure of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUSA = madeInUSA;

		System.out.println("Computer brand:" + brand + "\nModel:" + model + "\nOperating system:" + operatingSystem
				+ "\nPrice:" + price + "\nMade in USA:" + madeInUSA);
	}

}
