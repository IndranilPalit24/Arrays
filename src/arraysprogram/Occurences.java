package arraysprogram;
import java.util.*;

public class Occurences {

	public static void main(String[] args) {
		
		//Enter the length of the array
		System.out.print("Enter the length of the array: ");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		//Declare the array
		int [] arr1 = new int[n];
		
		//Enter the elements in the array
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		//Enter the value to entered to be removed from the array
		System.out.print("Enter the value to be entered to be removed from the array: ");
		int key = sc.nextInt();
		
		//Logic to remove the designated number
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]==key) {
				for(j=i;j<arr1.length-1;j++) {
					arr1[j] = arr1[j+1];
					
				}
				break;
				
			}
		}
		for(int i=0;i<arr1.length-1;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
