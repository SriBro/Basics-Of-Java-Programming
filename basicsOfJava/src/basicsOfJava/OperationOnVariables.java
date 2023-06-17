package basicsOfJava;

public class OperationOnVariables {
	public static void main(String[] args) {
		//1.Compound assignment operator
		System.out.print("1");
		int numOfCookies = 2;
		System.out.println(numOfCookies+=2);
		System.out.println(numOfCookies-=2);
		System.out.println(numOfCookies*=2);
		System.out.println(numOfCookies/=2);
		System.out.println(numOfCookies%=2);
		
		//2.order of operations - PEMMDAS(parenthesis, exponents, modulo/multiplication/division, addition/subtraction)
		System.out.print("2");
		System.out.println(5*4%3-2+1);
		
		//3.Greater and lesser
		System.out.print("3");
		int numOfCupCakes = 2;
		int numOfCupCakesWanted = 5;
		System.out.print("Enough cup cakes available: ");
		System.out.println(numOfCupCakesWanted<numOfCupCakes);
		System.out.print("Enough cup cakes not available: ");
		System.out.println(numOfCupCakes<numOfCupCakesWanted);
		
		//4.equals and not equals
		System.out.print("4");
		System.out.println(5==4);
		System.out.println(5!=4);
		
		//5.equals()
		System.out.print("5");
		System.out.println("Hey".equals("Hey"));
		System.out.println("Hey".equals("hey"));
		
		//6.String concatenation
		System.out.println("Hey "+"Hello "+" !");
	}
}
