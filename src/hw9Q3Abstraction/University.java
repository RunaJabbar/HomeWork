package hw9Q3Abstraction;

public interface University extends College, Hospital {
	/*
	 * public University() {
	 * }
	 * Interface cannot create an object and it cannot declare constructor.
	 * Object is needed to call method & interface can't create an object
	 */
	public void classSize();
	public void playGround();
	public void teacher();
	 /* One keyword extends is used to for the inheritance in Interface.
	  *Interface can inherit other Interfaces by using extends keyword, but cannot inherit regular or abstract class.
	 * More than one Interfaces can be inherited.
	 */
	public default void gymnasium() {
		}
	public static void library() {
	}
}