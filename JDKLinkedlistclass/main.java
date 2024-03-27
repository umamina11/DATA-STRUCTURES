package JDKLinkedlistclass;

import java.util.Iterator;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Employee billend = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        // prining the list (1st method)
        Iterator iter = list.iterator();
        System.out.println("HEAD->");

        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
        // prinintg list
        for (Employee employee : list) {
            System.out.println(employee);

        }
        // add item
        list.add(billend);
        iter = list.iterator();
        System.out.println("HEAD->");

        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
        // add last
        // add item
        list.addLast(billend);
        iter = list.iterator();
        System.out.println("HEAD->");

        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        // removing the items from the first
        list.remove();
        iter = list.iterator();
        System.out.println("HEAD->");

        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");

        // remove from last
        list.removeLast();
        iter = list.iterator();
        System.out.println("HEAD->");

        while (iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println("<=>");
        }
        System.out.println("null");
    }
}
