package hw4Q2JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe info = new AboutMe();// constructor initialized

		info.name = "Runa Jabbar";
		info.age = 30;
		info.houseNumber = 455;
		info.mySalary = 20000;
		info.sex = 'F';
		info.myHeight = 5.0f;
		info.myGrade = 4.89;
		info.nonCitizen = false;
		info.imaigineBalance = 9000000000000l;
		info.aboutMe();

		System.out.println("\n***************************\n");

		AboutMe info2 = new AboutMe();
		info2.name = "Alex";
		info2.age = 33;
		info2.houseNumber = 625;
		info2.mySalary = 4200;
		info2.sex = 'F';
		info2.myHeight = 5.4f;
		info2.myGrade = 5.90;
		info2.nonCitizen = true;
		info2.imaigineBalance = 80000000000l;
		info2.aboutMe();

	}

}
