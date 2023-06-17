package oops;

class ParentClass {
	//Redefining a method of a parent class inside a child class with same parameter list
	//return type must be same
	public void vehicle() {
		System.out.println("I am a vehicle");
	}
}
class ChildClass extends ParentClass{
	@Override
	public void vehicle() {
		System.out.println("I am a car");
	}
}
public class Overriding{
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.vehicle();
		obj.vehicle();
	}
}

