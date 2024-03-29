package Stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    // bakcing by array
    private Employee[] stack;
    private int top;
    // capacity of the stack upto which it can accept the values

    public ArrayStack(int Capacity) {
        stack = new Employee[Capacity];

    }

    // push method
    public void push(Employee employee) {
        // whether the stack is full
        if (top == stack.length) {
            // resize the array E
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;

        }
        stack[top++] = employee;
    }

    // removing the items
    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    // peeeking value which meanss getting the infromation about the top value
    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();

        }
        return stack[top - 1];
    }

    // size of the stack is top
    // seize method to get the
    public int size() {
        return top;

    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
