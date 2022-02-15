package hw11Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Sister sis = new Sister();
		sis.sister();
		sis.sister(20, "40");
		sis.sister(10, 20, 30);
		Sister.sister(30, 50, 10, "40");
		sis.sister(10, 20, 30, "40", 50, 60);
		
		Niece niece = new Niece();
		niece.sister();
		niece.sister(20, "40");
		niece.sister(10, 20, 30);
		niece.sister(10, 20, 30, "40", 50, 60);
		
		
		
		
	}
}