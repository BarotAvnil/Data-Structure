import java.util.*;

public class replace_1_2_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Elements of an Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the number to change in array");
        int num = sc.nextInt();
        int index =0;
        boolean flag = false;


        System.out.println("Enter the number to be replaced by that number");
        int replace = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                index=i;
                System.out.println("index is : "+index);            
                flag = true;
            }
    
        }

        arr[index]=replace;
        if (flag) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else{
            System.out.println("Number not found in array");
        }

    }
}