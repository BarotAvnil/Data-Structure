import java.util.Scanner;

public class Arr_Multi {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [][]arr1=new int[3][2];
    int [][]arr2=new int[2][3];
    int [][]multi=new int[3][3];
    System.out.println("enter element of 1st matrix: ");
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            System.out.println("enter numbers: ");
            arr1[i][j]=sc.nextInt();
        }
        
    }        

    System.out.println("enter element of 2nd matrix: ");
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.println("enter numbers: ");
            arr2[i][j]=sc.nextInt();
        }
      }        

      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<2;k++){
            multi[i][j]=arr1[i][k]*arr2[k][j];
        }
      }        
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.println("Answer : "+multi[i][j]);
        }
}
    System.out.println();
}
}