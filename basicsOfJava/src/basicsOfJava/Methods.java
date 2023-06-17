package basicsOfJava;

public class Methods {
	//method which will return the value of a factorial of number
	public int fact(int num) {
		if(num==1) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
	//method which will specify prime number or not
	public void primeNum(int number) {
		boolean isPrime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
			if(isPrime) {
				System.out.println(number+" is a Prime number");
			}
			else {
				System.out.println(number+" is not a prime number");
			}
	}
	public static void main(String[] args) {
		Methods obj = new Methods();
		System.out.println("Factorial is "+obj.fact(6));
		obj.primeNum(91);
	}
}
