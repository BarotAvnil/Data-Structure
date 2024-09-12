import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in your array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Implement the Shell Sort algorithm
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            // Iterate over the array, starting from the gap size and moving towards the end
            for (int j = gap; j < n; j++) {
                // Compare elements at indices i and i + gap, and swap them if they are in the
                // wrong order
                for (int i = j - gap; i >= 0; i -= gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        // Swap elements at indices i and i + gap
                        int temp = arr[i + gap];
                        arr[i + gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        // Print the sorted array (corrected output loop)
        System.out.println("Sorted Array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}