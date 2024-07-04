import java.util.Scanner;

public class Stack_operation_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack_operation stack = new Stack_operation(size);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.peep(2);
        stack.display();

    }

}

class Stack_operation {
    int[] arr;
    int top;

    Stack_operation(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack is Overflow");
        } else {
            top = top + 1;
            arr[top] = data;
            System.out.println("Element inserted successfully");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Element deleted successfully");
            top = top - 1;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public void peep(int i) {
        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println( "PEEP"+ arr[top - i + 1]);
        }
    }
    public void change(){
        

    }

}
