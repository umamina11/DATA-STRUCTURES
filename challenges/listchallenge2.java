/*LINK LIST CHALLENGE 2
 * Use the starter project in the resources section
 * implemenet a method in the integerLinkedList class that inserts a value in sorted order
 * Lower values should appear first in the list(be closer to the head)
 * if we insert 4,2,1,5, list should look like  HEAD->1->2->4->5->null
 * integerLinkedList is a singly-linked list 
 * project contains all the code you need and an empty insert sorted methods
 * main method conatins the code that should work when you are finished
 * 
 * 
 * understanding
 * 
 * here as developer we need to print a list in such a way that it is sorted in ascending order
 * along with head at first and null at last 
 * for sorting the list we need to use the simple swap mehtods where we compare the items other than head and null and
 * swap them in such a way that we get sorted list
 * 
 * conditions need to be checked 
 * implement singly linked list 
 * so for that we need 
 * whether the lsit is empty or not
 * fist the head and the null
 * need a temporary variable 
 * 
 * 
 * 3 classes
 * main: to run and insert values
 * node: defining values and their objects 
 * sorted linked list : to sorte the inserted elements and display
 * taking a value check whether the list is empty or not if empty then put the first node as head and 
 * 
 * 
 */

package challenges;

public class listchallenge2 {

    public static void main(String[] args) {
        SortedLinkedList linkedList = new SortedLinkedList();
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insert(5);

    }
}
