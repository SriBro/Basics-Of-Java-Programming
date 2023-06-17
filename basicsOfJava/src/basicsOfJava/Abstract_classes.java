package basicsOfJava;
//abstract classes serve as templates to declare common variables and methods for subclasses
//abstract class is a class which contains abstract methods
//those methods which only have declaration but not definition are called abstract methods
//classes overriding abstract methods should extend abstract class
//classes extending abstract classes can have abstract methods as well
//We can create objects of only concrete classes.
abstract class AA{
	abstract void display();
}
abstract class BB extends AA {
	@Override
	void display() {
		System.out.println("I am method of class AA");
	}
	abstract void display2();
}
public class Abstract_classes extends BB{
	@Override
	void display2() {
		System.out.println("I am a method of class BB");
	}
	public static void main(String[] args) {
		Abstract_classes obj = new Abstract_classes();
		obj.display();
		obj.display2();
	}
}
