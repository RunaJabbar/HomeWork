package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();		
		System.out.println("\n...............................\n");		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();		
		System.out.println("\n...............................\n");		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();		
		System.out.println("\n...............................\n");		
		Birds birds = new Birds();//here Birds is the child class and Animal is the Parent class.
		birds.birdsInfo();
		birds.animalInfo();		
		System.out.println("\n................................\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();		
		System.out.println("\n.................................\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();		
		System.out.println("\n..................................\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("\n...................................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.mammalInfo();
		bullDog.dogInfo();
		bullDog.animalInfo();	
//		Multi level hierarchical shown below
		System.out.println("\n...................................\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();		
	}
}