import java.util.Scanner;
public class sum {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number: ");
    int m=sc.nextInt();
    System.out.println("enter second number: ");
    int n=sc.nextInt();
    int sum=0;
    for(int i=m;i<n;i++){
        sum+=i;
      }
      System.out.println(sum);
   } 
}