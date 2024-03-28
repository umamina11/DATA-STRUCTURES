/*Linked list challenge 1
 * -implement the addBefore() method for the EmployeeDoublyLinkedList class
 * -Use the starter project in the resources section
 * -Projext contains all the code you need and an empty addBefore() method
 * -Main method conatins code that should work when you are finished 
 * 
 * 
 * 
 * 
 * undersatanding :
 * so we need to implement the doubly linked list 
 * in which we need a main class (for running the whole code), employee class (getter and setter methods, differnt functionalities), doublylinkedlist class (functionalities of doubly linked list
 * defining all pervious, next, null , head, tail and other elements of the list ), employeenode class
 * 
 * as already we have JDK funciton to add, remove, insert the nodes 
 * here as per question we need to use the code that we have implemented previously and in that add the another method called as add before
 * as per my interepretation i need to add a element from an existing element
 * let for example if i have list
 * null<->Bill<->James<->Bob<->Mike<->null 
 * in this i need to add a new element call Marry before some specifice node i dont know it is head node or tail node or some other so accordingly we need to perfrom this 
 * 
 * algo 
 * 
 * let  copy paste the other elements from the previous implementaion and then add Before method
 *  introduce a boolean along with addbefore method define the two variables( new items and the other one will be the exisiting data)
 * check list is empty or not 
 * Check whether the iteme (existing item)is there in list or not 
 * if not then there is not infromation for algo to run as exisitng items is not there 
 * so no infromation that where to insert
 * already defined libaray so if addes sucesfully print that message 
 */

package challenges;

public class listchallenge1 {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        // adding in the end
        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        // removing from the front
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        // remove from the end
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        // addbefore
        list.addBefore(billEnd, johnDoe);
        list.printList();

        list.addBefore(new Employee("Some", "Else", 111), mikeWilson);

    }
}
