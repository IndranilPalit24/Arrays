package arraysprogram;
import java.util.*;

public class Find_array_equality {

	public static void main(String[] args) {
		
		//Enter the length of arrays
		System.out.print("Enter the length of the arrays: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		//Declaring two arrays
		int []arr1 = new int[n];
		int [] arr2 = new int[n];
		
		//Enter the elements in the array 1
		System.out.println("Enter the elements in the array 1: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of the second array: ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int i = 0;
		if(arr1[i]==arr2[i]) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
