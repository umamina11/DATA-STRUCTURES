/* STACK CHALLENGE 1
-using a stack, determine whether a string is a palindrome
- strings many conatin punctuations and spaces. They should be ignored.
case should be ignored
Example: "I did,did I?" is a palindrome
Racecar is a palindrome
hello is not a palindrome
use starter project in resources sections

-------------------
Understanding 
okay using the stack datastructure we need to implement and then idenfiy that the
items are palidrome or not (words, statements which look alike if read from left or right like mirror image )
 *
 *  okay so first we need to push the items in the list and then check the condition using the peek methods and print
 * the result statement 
 * Classes:
 * one should be the main class
 * then a stack class to check palindrome
 * 
 * okay the approach will be collect all the items in stack and then pop the items that are eother special characters or saces 
 * and then comapre the alphabets for palindronme
 *  
 */

package challenges;

import java.util.LinkedList;

public class stackchallenge1 {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        // collexting all the characters in the list so that we can ignore all the
        // special characters
        // and spaces andsfter than comapring only alphabets for the palindrome
        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctuation.toString());
    }

}
