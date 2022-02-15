package hw11Q3Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {
	
	public abstract void hygiene();
	public void caring() {
		System.out.println("This is NursingScool Class");
	}
}//Please follow the below inheritance. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool implements LawSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate ColumbiaUniversity , University and MedicalSchool one by one. Call all the possible methods from the object of ColumbiaUniversity , University and MedicalSchool. Make sure you execute the static methods from ColumbiaUniversity , University and MedicalSchool (if not created, please create one). Try to create default method (public default void ...........[follow the format of default method from interface]) in regular class and abstract class if possible and execute them if possible. Paste the github link below.