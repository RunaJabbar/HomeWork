package hw5Q2Constructor;

import hw2Q2JavaBasics.MyCar;

// My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration. (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default constructure of Computer class.");
	}

	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUSA){
	this.brand= brand;
	this.model = model;
	this.operatingSystem= operatingSystem;
	this.price= price;
	this.madeInUSA= madeInUSA;
	
	System.out.println("Computer brand:" + brand + "\nModel:" + model + "\nOperating system:" + operatingSystem + "\nPrice:" + price + "\nMade in USA:" + madeInUSA);
	}



		// My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price:
		// 800$, Grade: A and Made in USA? Ans: false.
	


	}

