import java.util.Scanner;
import java.util.Stack;


public class Recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}

public static boolean CheckString(String str){
    Stack<Character> stack = new Stack<Character>();
    int index = 0;
    stack.push('c');
    char next = stack.CharAt(index);
    while (next != 'c'){
        if (next == ' '){
            return false;
        }
        stack.push(next);
        index++;
        next = string.CharAt(index);
    }
    index++;
    while (stack.peek() != 'c' && index <stack.length()) {
        
    }
}