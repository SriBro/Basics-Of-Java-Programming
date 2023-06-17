package arrays;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//add method to add elements to our empty array
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(num);
		
		//adding number at a specified index
		num.add(2,22);
		//updated ArrayList
		System.out.println(num);
		//Getting the size of ArrayList
		System.out.println(num.size());
		//Accessing first element of the ArrayList using index
		System.out.println(num.get(0));
		//Accessing first element using indexOf() method
		System.out.println(num.indexOf(1));
		//updating first value of ArrayList
		num.set(1,33);
		System.out.println(num);
		//Removing first element of ArrayList using remove()
		num.remove(0);
		System.out.println(num);
	}
}
