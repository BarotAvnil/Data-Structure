import java.util.Scanner;

public class insert_num_at_given_location {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the location where you want to insert the number: ");
        int loc = sc.nextInt();
        System.out.println("Enter the number you want to insert: ");
        int num = sc.nextInt();
        int index = 0;
        int temp[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) 
        {
            if (i < loc) {
                temp[i] = arr[index];
                index++;

            } else if (i == loc) {
                temp[i] = num;
            } else {
                temp[i] = arr[index];
                index++;
            }
        }
        System.out.println("The new array after inserting the number is: ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
