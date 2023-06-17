//Multilevel inheritance is when class One is parent, class Two is parent but a child to class Two and class Three is a child to both
//but by creating object of class Three, we can access methods and variables of class One and Two
package oops;
class One{
	public int factorial(int num) {
		if(num==1)
			return 1;
		else 
			return num*factorial(num-1);
		}
}
class Two extends One{
	public void primeNum(int num) {
		boolean isPrime = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}
}
public class MultilevelInheritance extends Two{
	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
		System.out.println(obj.factorial(6));
		obj.primeNum(11);
	}
}
