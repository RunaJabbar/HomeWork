package hw11Q2Polymorphism;

public class Sister {
	
	public void sister() {
		
	}

	public void sister(int age1, int age2, int age3) {
		int total = age1 + age2 + age3;
		System.out.println("Total age from Sister Class: " + total); 
	}
		
	public int sister(int age2, String age4) {
		int total2 = age2 + Integer.parseInt(age4);
		System.out.println("This is from total2: ");
		return total2;
	}
	public static int sister(int age3, int age5, int age1, String age4) {
		int total3 = age3 + age5 + age1 + Integer.parseInt(age4);
		System.out.println("Total3 age of Sister: ");
		return total3;
	}

	public final int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total4 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		return total4;
	}
}