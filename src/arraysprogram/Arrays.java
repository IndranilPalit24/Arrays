package arraysprogram;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		
		Scanner sc= new Scanner(System.in);
		//input size of the array
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		//array declaration
		int arr[] = new int[n];
		
		//Enter the elements in the array
		System.out.println("Enter the elements in the array");
		for(int i =0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		
		//find given number in the array
		System.out.println("Enter the number to be found in the array");
		int key=sc.nextInt();
		
		//Logic
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag = true;
			}
		}
		if(flag=true) {
			System.out.println("Number is found");
		}
		else {
			System.out.println("Number not found");
		}
	}
}
