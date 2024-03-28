package Stacks;

public class ArrayStack {
    // bakcing by array
    private Employee[] stack;
    private int top;
    // capacity of the stack upto which it can accept the values

    public ArrayStack(int Capacity) {
        stack = new Employee[Capacity];

    }

    // push method
public static void push(Employee employee){
    // whether the stack is full
    if (top == stack.length){
       // resize the array E
    Employee[] newArray new Employee[2*stack.length];
    System.arraycopy(stack,0,newArray,0,stack.length);
    stack=newArray;


    }
    stack[top++]=employee;
}

    public Employee pop() {
        if (isempty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public boolean isEmpty() {
        return top = 0;
    }
}
