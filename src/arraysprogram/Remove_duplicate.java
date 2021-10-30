package arraysprogram;
import java.util.*;

public class Remove_duplicate {

	public static void main(String[] args) {
		
		//Enter the length of the array
		System.out.print("Enter the length of the array: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		//Array declaration
		int[] arr = new int[n];
		int[]temp=new int [n];
		
		//Enter the numbers in the array
		System.out.println("Enter the numbers in the array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[arr.length-1];
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
		
	
	}

}
