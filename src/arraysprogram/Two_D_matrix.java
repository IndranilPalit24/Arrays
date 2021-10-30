package arraysprogram;
import java.util.*;

public class Two_D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare length of the array
		System.out.print("Enter the length of the matrix: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [][]mat = new int[n][n];
		
		//Enter the elements in the array
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		//Print the matrix in the loop
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
		}
	}

}
