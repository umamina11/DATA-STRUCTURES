package Queues.circularqueue;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    // intitial both values will be 0
    // defining capacity of queue
    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];

    }

    // adding items
    public void add(Employee employee) {
        // check queue is full or not

        // assigning the back to front so that it forma a circualr loop
        // wrap back to first

        if (size() == queue.length - 1) {
            Employee[] newArray = new Employee[2 * queue.length];
            int numitems = size();
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;

            front = 0;
            back = numitems;
        }
        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    // remove items from queue
    public Employee remove() {
        // check queue is empty or not
        if (size() == 0) {
            throw new NoSuchElementException();

        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return employee;
    }

    // peek
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();

        }
        return queue[front];

    }

    public int size() {
        return back - front;
    }

    // print the queue
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}