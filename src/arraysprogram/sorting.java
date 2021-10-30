
package arraysprogram;
import java.util.*;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner sc = new Scanner(System.in);
		int []arr = new int[5];
		
		//Enter the elements in the array
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
		}
		
		//ascending order
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println();
		System.out.println("The numbers arranged in the order are: ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
