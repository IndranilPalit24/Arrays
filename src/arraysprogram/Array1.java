package arraysprogram;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int flag =0;
		
		//Enter the length of array
		System.out.print("Enter the array length: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		//entering values in array
		for(int i=0;i<arr.length;i++) {
		System.out.println("Enter your values: ");
		arr[i] =sc.nextInt();
		}
		
		
		//Enter the value to be find in the array
		System.out.print("Enter the value to be found in the array: ");
		int key = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag =1;
			}
		}
		if(flag==1) {
			System.out.print("True");
		}else {
			System.out.print("False");
		}
		
	}

}
