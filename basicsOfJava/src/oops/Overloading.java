package oops;

public class Overloading {
	//same method name, different parameters, same class
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public double add(double num1, double num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		System.out.println(obj.add(3, 6));
		System.out.println(obj.add(2.9, 0.1));
	}
}
