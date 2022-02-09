package hw9Q2Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Monica Geller");
		employee.setEmpAge(56);
		employee.setEmpSex('F');
		employee.setUsCitizen(true);
		System.out.println("Employee name:" + employee.getEmpName() + ",\nAge:" + employee.getEmpAge() + ",\nSex:" + employee.getEmpSex() + ",\nUS Citizen:" + employee.isUsCitizen());		
	}
}