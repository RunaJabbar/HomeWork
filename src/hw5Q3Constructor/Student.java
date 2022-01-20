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
		
	public	 Student(String StName, int stID, char sex, boolean isProgrammer, float grade) {
	this.StName= StName;
	this.stID= stID;
	this.sex= sex;
	this.isProgrammer= isProgrammer;
	this.grade= grade;
	
	System.out.println("Student name: " + StName + "\nID: " + stID + "\nSex: " + sex + "\nGrade: " + grade + "\nJava Programmer: " + isProgrammer);
	}
	
	
	
	// Create a class "Student". Declare some variable -- StName, stID, sex, isProgrammer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Create another class StudentTest. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. in the next line, The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true.
		
		
		

	}


