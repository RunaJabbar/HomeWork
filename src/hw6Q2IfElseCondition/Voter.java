package hw6Q2IfElseCondition;

public class Voter {
	public static void main(String[] args) {
		int age = 30;
		if (age == 18) {
			System.out.println(age + "I am a voter" + 18);
		} else if (age < 18) {
			System.out.println(age + "I am not a voter" + 18);
		}if (age >= 18) {
			System.out.println("I am a voter");
		} else {
			System.out.println("Please add a valid age");
		}
	}
}
