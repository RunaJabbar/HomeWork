package hw5Q3Constructor;

public class Student {
	public String StName;
	public int stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructure of student class");
	}

	public Student(String StName, int stID, char sex, boolean isProgrammer, float grade) {
		this.StName = StName;
		this.stID = stID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;

		System.out.println("Student name: " + StName + "\nID: " + stID + "\nSex: " + sex + "\nGrade: " + grade
				+ "\nJava Programmer: " + isProgrammer);
	}

}
