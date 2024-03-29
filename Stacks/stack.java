package Stacks;

public class stack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack(); // printing the stack

        // peek items
        System.out.println(stack.peek());

        // pop items
        System.out.println("popped:" + stack.pop());

    }
}
