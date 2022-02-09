package hw9Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool{ //, EngineeringSchool 	
	/*Keyword extends is used for the inheritance in abstract class.
	 * abstract class can inherit other abstract class or regular class but cannot inherit Interface using the extends keyword.
	 * Only one inheritance is possible by abstract class.
	 */
	public MedicalSchool() {
	}
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.out.println("Hi");
	}
}