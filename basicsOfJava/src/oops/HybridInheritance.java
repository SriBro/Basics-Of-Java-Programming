package oops;
//combination of single and multiple inheritance
class HumanBody{
	public void display() {
		System.out.println("I am a method of parent class");
	}
}
interface Male{
	public void show();
}
interface Female{
	public void show();
}
class Child extends HumanBody implements Male,Female{
	@Override
	public void show() {
		System.out.println("I am a method of male and female interface");
	}
	public void childMethod() {
		System.out.println("I am a child method single inheriting class HumanBody and multiple inheriting class Male and Female");
	}
}
public class HybridInheritance{
	public static void main(String[] args) {
		Child obj = new Child();
		obj.display();
		obj.show();
		obj.childMethod();
	}
}