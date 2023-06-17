//calling methods and variables of parent class using child class is called SingleInheritance.
package oops;

class A{
	public int factorial(int num) {
		if(num==1)
			return 1;
		else {
			return num*factorial(num-1);
		}
	}
}
public class SingleInheritance extends A {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("Factorial is: "+a.factorial(5));
	}
}
