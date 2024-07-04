package lab6;

import java.util.Scanner;
class Employee_Detail{
    int Employee_ID;
    String  Name;
    String Designation;
    int Salary; 
    void Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details :");
        Employee_ID = sc.nextInt();
        Name = sc.next();
        Designation = sc.next();
        Salary = sc.nextInt(); 
    }
    void display(){
        System.out.println("Id : "+Employee_ID);
        System.out.println("Name : "+Name);
        System.out.println("Designation : "+Designation);
        System.out.println("Salary : "+Salary);
    }
}
public class Lab6a2 {
    public static void main(String[] args) {
        Employee_Detail e = new Employee_Detail(); 
        e.Employee();
        e.display();
    }
}
