import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string containing brackets
        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();

        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Variable to track if parentheses are balanced
        boolean isBalanced = true;

        // Traverse each character in the string
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // If opening bracket, push into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // If closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack is empty → not balanced
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                // Pop last opening bracket
                char top = stack.pop();

                // Check matching pair
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    isBalanced = false;
                    break;
                }
            }
        }

        // If stack still contains elements → not balanced
        if (!stack.isEmpty()) {
            isBalanced = false;
        }

        // Print result
        if (isBalanced) {
            System.out.println("Parentheses are Balanced.");
        } else {
            System.out.println("Parentheses are NOT Balanced.");
        }

        // Close scanner
        sc.close();
    }
}