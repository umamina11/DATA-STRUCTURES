/*using a stack and a queue determine whether a string is a palindrome 
 * Strings mau conatin punctuation and spaces. They should be ignored.case should be ignored
 * Example:
 * "i did, did i? " is a palindrome
 * "racecar" is  a palindrome
 * "hello" is not a palindrome
 * 
 * 
 */

package challenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queuechallenge {
    public static boolean isPalindrome(String str) {
        // Remove punctuation and spaces and convert to lowercase
        String cleanStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push characters into stack and enqueue into queue
        for (char c : cleanStr.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        // Compare characters from stack and queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false; // Not a palindrome
            }
        }

        // If both stack and queue are empty, it's a palindrome
        return stack.isEmpty() && queue.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "i did, did i? ";
        String str2 = "racecar";
        String str3 = "hello";

        System.out.println("\"" + str1 + "\" is a palindrome: " + isPalindrome(str1));
        System.out.println("\"" + str2 + "\" is a palindrome: " + isPalindrome(str2));
        System.out.println("\"" + str3 + "\" is a palindrome: " + isPalindrome(str3));
    }
}
