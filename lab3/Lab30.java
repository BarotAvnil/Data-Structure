package lab3;
import java.util.Scanner;
public class Lab30{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		int sum[][] = new int[2][2];
		System.out.println("Enter the elements for the first array : ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("Enter element of 1st array["+i+"]["+j+"]");
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements for the second array : ");
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.println("Enter element of 2nd array["+i+"]["+j+"]");
				arr2[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}