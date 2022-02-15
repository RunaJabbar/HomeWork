package hw11Q3Abstraction;

public interface University extends College, Hospital {
	// public University() {
	// }
	// Interface cannot create an object and it cannot declare constructor.
	// Object is needed to call method & interface can't create an object/
	public void classSize();
	public void playGround();
	public void teacher();
	// One keyword extends is used to for the inheritance in Interface. Interface
	// can inherit other Interfaces by using extends keyword, but cannot inherit
	// regular or abstract class. More than one Interfaces can be inherited.
	public default void gymnasium() {
	}
	public static void library() {
	}
}//Please follow the below inheritance. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool implements LawSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , University and MedicalSchool one by one. Call all the possible methods from the object of ColumbiaUniversity , University and MedicalSchool. Make sure you execute the static methods from ColumbiaUniversity , University and MedicalSchool (if not created, please create one). Try to create default method (public default void ...........[follow the format of default method from interface]) in regular class and abstract class if possible and execute them if possible. Paste the github link below.