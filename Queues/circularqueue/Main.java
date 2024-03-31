package Queues.circularqueue;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);
        /*
         * queue.add(janeJones);
         * queue.add(johnDoe);
         * queue.remove();
         * queue.add(marySmith);
         * queue.remove();
         * queue.add(mikeWilson);
         * queue.remove();
         * queue.add(billEnd);
         * queue.remove();
         * queue.add(janeJones);
         */

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        queue.printQueue();

        // remove
        queue.remove();
        queue.remove();
        queue.printQueue();

        // peek
        System.out.println(queue.peek());
        queue.printQueue();

    }
}
