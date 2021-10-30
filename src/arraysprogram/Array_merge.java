package arraysprogram;
import java.util.*;

public class Array_merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Enter the length of the first array and second array
		System.out.println("Enter the length of the arrays: ");
		int n = sc.nextInt();
		int []arr1 = new int[n];
		int []arr2 = new int[n];
		
		//Enter the elements in the array1
		System.out.println("Enter the elements in the array 1: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		//Enter the elements in the second array
		System.out.println("Enter the elements in the array 2:");
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		//Store the length of array 1 and array 2 in integer variable
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int arr3_length = arr1_length+arr2_length;
		int []c = new int[arr3_length];
		
		//push the elements of array 1 in array 3
		for(int i=0;i<arr1.length;i++) {
			c[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			c[arr1.length+i] = arr2[i];
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+", ");
		}
	}

}
