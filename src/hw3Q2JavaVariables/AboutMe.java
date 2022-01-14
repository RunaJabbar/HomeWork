package hw3Q2JavaVariables;

public class AboutMe {

	// (2) Create a package name "hw3Q2JavaVariables" inside the Home work project,
	// Create a Class name "AboutMe". Declare only one type of variable(so you know
	// declare vs initialize), and initialize String and other 8 types of variable
	// (you can give a different name from mine). Instantiate AboutMe class under
	// main method and call few variables by object (you can use String
	// concatenation to make it more meaningful outcome). Give a single line comment
	// where a variable is declared and initialized. Follow indentation by
	// Organizing the code and paste below. [Mark distribution (80) : using variable
	// --20, instantiate class - 20, call variables by object and print a meaningful
	// outcome 20, comment for variable is declared and initialized - 10, organize
	// code and other-- 10]

	public String name = "Runa Jabbar";
	public int houseNumber = 455;
	public byte age = 30;// Age is initialized here.
	public byte classAttended; // classAttended is declared.
	public long imaigineBalance = 9000000000000l;
	public short mySalary = 20000;
	public char sex = 'F';
	public float myHeight = 5.0f;
	public double myGrade = 4.89;
	public boolean nonCitizen = false;

	public static void main(String[] args) {

		AboutMe info = new AboutMe();
		System.out.println("My name: " + info.name);
		System.out.println("My age: " + info.age);
		System.out.println("imaigineBalance: " + info.imaigineBalance);

	}

}
