package arrays;
import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		String[] travel = {"Switzerland","Great Wall Of China","Disney World"};
		System.out.println(Arrays.toString(travel));
		//Printing first element of array
		System.out.println(travel[0]);
		
		//Creating an empty array
		int[] numArray = new int[3];
		numArray[0]=1;
		numArray[1]=2;
		numArray[2]=3;
		System.out.println(Arrays.toString(numArray));
		//printing length of array
		System.out.println(numArray.length);
	}
}
