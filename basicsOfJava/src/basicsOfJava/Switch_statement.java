package basicsOfJava;
import java.util.Scanner;

public class Switch_statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Factorial");
		System.out.println("2.Prime Number");
		System.out.println("3.Fibonacci series");
		System.out.println("4.Armstrong number\n");
		System.out.println("Choose any one of the above number: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			System.out.println("Enter any number: ");
			int number = sc.nextInt();
			int fact=1;
			for(int i=1;i<=number;i++) {
				fact = fact*i;
			}
			System.out.println("Factorial of "+number+" is "+fact);
			break;
		case 2:
			System.out.println("Enter any number: ");
			int number2 = sc.nextInt();
			boolean isPrime = true;
			for(int i=2;i<number2;i++) {
				if(number2%i==0) {
					isPrime=false;
					break;
				}
			}
				if(isPrime) {
					System.out.println(number2+" is a prime number");
				}
				else {
				System.out.println(number2+" is not a prime number");
				}
		case 3:
			System.out.println("Enter any number: ");
			int number3 = sc.nextInt();
			int k=0; int a=1; int b=1;
			System.out.print("1 1 ");
			while(k<=number3) {
				k = a+b;
				if(k>=number3) {
					break;
				}
				System.out.print(k+" ");
				a=b;b=k;
			}
		case 4:
			System.out.println("Enter any number: ");
			int n = sc.nextInt();
			int temp=n;
			int r,sum=0;
			while(n>0) {
				 r = n%10;
				 n = n/10;
				 sum=sum+r*r*r;
			}
			if(temp==sum) {
				System.out.println(temp+" is an armstrong number");
			}
			else {
				System.out.println(temp+" is not an armstrong number");
			}
		}
	}
}
	

