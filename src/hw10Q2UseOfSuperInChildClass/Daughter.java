package hw10Q2UseOfSuperInChildClass;

public class Daughter extends Father{
	public String birthMonth;
	public int age;
	
	public Daughter() {
		super();
		super.father();
		super.fatherInfo(birthMonth, age, sex, usCitizen, birthMonth);
		super.familyName = ("Jabbar");
		System.out.println("This is from the default Constructor");		
	}

	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is from parameterized constructor");
	}
	public void daughter() {
		System.out.println();
	}
	public void daughterInfo(String birthMonth, int age) {
		System.out.println();			
	}
}