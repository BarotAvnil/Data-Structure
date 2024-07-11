import java.util.Scanner;

public class Arr_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] sum = new int[2][2];
        System.out.println("Enter matrix 1 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2 : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("sum of matrix is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(sum[i][j] + " ");

            }

        }
    }
}