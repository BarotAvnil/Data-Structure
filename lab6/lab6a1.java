package lab6;

import java.util.Scanner;

public class lab6a1 {
    int a;
    int b;
   
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("enter a number A"+a);
        System.out.println("enter a number B"+b);

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number x");
        int x = sc.nextInt();
        System.out.println("enter a number y");
        int y = sc.nextInt();
        swap(x,y);
    }
}
