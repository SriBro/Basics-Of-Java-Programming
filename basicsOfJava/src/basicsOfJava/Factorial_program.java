package basicsOfJava;
import java.util.Scanner;

class CalculateFactorial {
	int factorial = 1;
	 public int fact(int num) {
		for(int i=1;i<=num;++i) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
public class Factorial_program{
		public static void main(String[] args) {
			CalculateFactorial obj = new CalculateFactorial();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			System.out.println("Factorial of "+num+" is: "+obj.fact(num));
		}
}
