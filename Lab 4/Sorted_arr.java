import java.util.Scanner;

public class Sorted_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = {1,5,2,7,6};
        int temp = a[0];
        System.out.println("Orignal series is : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Ascending order : ");
       for(int i = 0;i<a.length;i++){
        for(int j = 0;j<a.length;j++){
            if(a[i]<a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
       }
       for(int i = 0;i<a.length;i++){
        System.out.print(a[i]+" ");
       }  
    }
}