package arraysprogram;
import java.util.*;

public class Find_Largest_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Enter the length of array
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		//Declare the array
		int [] arr = new int[n];
		
		//Enter the values in the array
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the values in the array");
		arr[i] = sc.nextInt();
		}
		
		//
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print("The maximum element in the array is: "+max);
		
	}

}
