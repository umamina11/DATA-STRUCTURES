/*Peek, isEmpty, isFull
The peek, isEmpty, and isFull are some other functions used in stacks.

peek - This function allows you to look at the element at the top of the stack. It's a way to inspect the next item that would be removed if a pop operation were to be performed.

For a stack: Peek would return the last item added (since stacks follow Last In, First Out order).
isEmpty - This function checks whether a data structure (like a stack, queue, list, etc.) contains any elements or not.

If the data structure contains no elements, isEmpty returns true.
If there is at least one element in the data structure, isEmpty returns false.
isFull - This function is typically relevant for a fixed size stack. It allows you to determine if the data structure has reached its maximum capacity.

Task
You are given implementation of peek,isEmpty and isFull function of stack
Peek function return the element present in the peek of stack in case stack is empty it returns -1.
isFull fuction return 1 if the stack is full and return 0, if the stack is not full.
Fill the dash present in the function and submit the code.*/

public class peekIsemptyIsfull {
    static int peek() {
        int top;
        if (top >= 0) {
            int ele = a[top];
            System.out.println("Peeked: " + ele);
            return ele;
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
    }

    static boolean is_empty() {

        return top == -1;
    }

    static boolean is_full() {
        return top >= MAX_SIZE;
    }

}
