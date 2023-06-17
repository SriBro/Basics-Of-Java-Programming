package arrays;

import java.util.Arrays;

public class TwoDArray {
	public static void main(String[] args) {
		//Declaring and initializing a Two D Array
		int[][] num = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		//printing elements of Two D Array
		System.out.println(Arrays.deepToString(num));
		//Accessing element of first row and first column
		System.out.println(num[0][0]);
		System.out.println("\n");
		//Printing elements of array using loop
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++){
				System.out.print(num[i][j]);
			}
		}
	}
}
