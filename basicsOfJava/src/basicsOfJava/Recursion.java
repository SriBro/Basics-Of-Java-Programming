//Calculating factorial using Recursion
package basicsOfJava;
import java.util.Scanner;

class CalculateFactorial2{
	public int fact(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num * fact(num-1);
		}
	}
}
public class Recursion {
	public static void main(String[] args) {
		CalculateFactorial2 obj =  new CalculateFactorial2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is: "+obj.fact(num));
	}
}
