import java.util.*;

public class Recognize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        CheckString(str);
    }
    public static boolean CheckString(String str) {
        Stack<Character> stack = new Stack<Character>();
        int index = 0;
        stack.push('c');
        char next = str.charAt(index);
        while (next != 'c') {
            if (next == ' ') {
                return false;
            }
            stack.push(next);
            index++;
            next = str.charAt(index);
        }
        index++;
        while (stack.peek() != 'c' && index < str.length()) {
            next = str.charAt(index);
            if (next != stack.pop()) {
                return false;
            }
            index++;
        }
        next = str.charAt(index - 1);
        if (next != ' ' && stack.peek() != 'c') {
            return false;
        } else {
            return true;
        }
    
    }
}

