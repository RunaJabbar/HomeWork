package hw11Q2Polymorphism;

public class Niece extends Sister {
	
	//Method overriding is when methods have same name same parameters or signatures but different syntax or logic.
	@Override
	public void sister() {

	}

	@Override
	public void sister(int age1, int age2, int age3) {
		int total = age1 + age2 + age3;
		return;
	}

	@Override
	public int sister(int age2, String age4) {
		int total2 = age2 + Integer.parseInt(age4);
		return total2;
	}
// static type method cannot be overridden.
	// @Override
	// public static int sister(int age3, int age5, int age1, String age4) {
	// int total3 = age3 + age5 + age1 + Integer.parseInt(age4);
	// System.out.println("Total3 age of Sister");
	// return total3;

//Final type method cannot be overridden.
	// @Override
	// public final int sister(int age1, int age2, int age3, String age4, int age5,
	// int age6) {
	// int total4 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
	// return total4;

}
