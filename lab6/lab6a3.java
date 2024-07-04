package lab6;

 import java.util.Scanner;

class Student_Detail {
    int Enrollment_No;
    String Name;
    int Semester;
    float CPI;

    Scanner sc = new Scanner(System.in);

    void get(){
        this.Enrollment_No = sc.nextInt();
        this.Name = sc.next();
        this.Semester = sc.nextInt();
        this.CPI = sc.nextFloat();
    }
    void print(){
        System.out.println("No : "+this.Enrollment_No);
        System.out.println("Name : "+this.Name);
        System.out.println("Semester : "+this.Semester);
        System.out.println("CPI : "+this.CPI);
    }
}
public class lab6a3 {
    public static void main(String[] args) {
        Student_Detail s[] = new Student_Detail[2];
        for(int i=0;i<2;i++){
            s[i] = new Student_Detail();
            System.out.println("for student "+i+" : ");
            s[i].get();
        }
        for(int i=0;i<2;i++){
            System.out.println("for student "+i+" : ");
            s[i].print();
        }
    }

 {
    
}
