package hw10Q2UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This is a default constructure from Father class");
	}
	public Father(String name, int age, char sex, boolean usCitizen, String familyName) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	}

	public void father() {
		System.out.println("This is from void type method");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen, String familyName) {
		System.out.println("This is from parameterized method fatherInfo");
	}
}