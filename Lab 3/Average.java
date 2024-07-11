import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n=sc.nextInt();
       int count=1;  
       int a=0,sum=0;
       float Average=0;
        while (count<=n) {
            System.out.println("enter number "+count);
            a=sc.nextInt();
           sum+=a;
            count++;
        }
         Average= (sum/n);
         System.out.println("average of number: "+Average);
    }

}