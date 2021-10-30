package arraysprogram;
import java.util.*;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Enter the size of the array
		System.out.println("Enter the size of the array: ");
		int n= sc.nextInt();
		
		//Declare the array
		int [] arr = new int[n];
		
		//Write the elements in the array
		System.out.println("Write the elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]<max) {
			System.out.println("Max value is "+max);
		}//else if(arr[i]>min) {
			//System.out.println("Min Value is "+min);
		//}
	}
	
	
	}

}
