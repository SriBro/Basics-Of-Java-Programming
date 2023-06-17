package basicsOfJava;

public class GetterSetter2 {
	public static void main(String[] args) {
		GetterSetter getterSetter = new GetterSetter("Sri",002,800);
		System.out.println(getterSetter.getBalance());
		//cannot access private variables directly
		//System.out.println(balance);
		getterSetter.setBalance(900);
		System.out.println(getterSetter.getBalance());

		
	}
}
