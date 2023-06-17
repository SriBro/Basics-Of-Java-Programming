package basicsOfJava;

public class Variables {
	public static void main(String[] args) {
		//Variables and methods are written in camel case while class names with pascal case
		//any constant value assigned to a variable is called as literal
		//variable name can be started with $,_,any letter except number or any other special character
		int numOfFruits = 12;
		char firstLetterInEnglish = 'A';
		double percentage = 30.9;
		String fruit = "apple";
		String greetings = new String("Namaste");
		boolean willItRain = true;
		System.out.println("Integer value: "+numOfFruits);
		System.out.println("double value: "+percentage);
		System.out.println("boolean value: "+willItRain);
		System.out.println("character value: "+firstLetterInEnglish);
		System.out.println("String value: "+fruit);
		System.out.println("String value: "+greetings);
		
	}
}
