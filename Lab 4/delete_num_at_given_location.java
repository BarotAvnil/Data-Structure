import java.util.Scanner;

public class delete_num_at_given_location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location of the number you want to delete");
        int loc = sc.nextInt();

        int index = 0;
        int temp[] = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < loc) {
                temp[i] = arr[index];
                index++;

            } else if (i == loc) {
                index++;
            } else if (i > loc) {
                temp[i - 1] = arr[index];
                index++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}
