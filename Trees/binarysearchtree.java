package Trees;

public class binarysearchtree {
    public static void main(String[] args) {

        Tree intTree = new Tree();
        // inserting values
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        // traversing in order
        intTree.traverseInOrder();
        System.out.println();
        // get method
        System.out.println(intTree.get(27));
        System.out.println(intTree.get(30));
        System.out.println(intTree.get(11));

        // min and max
        System.out.println(intTree.min());
        System.out.println(intTree.max());

        // delete method
        // one child
        intTree.delete(15);
        intTree.traverseInOrder();
        System.out.println();
        // 0 child
        intTree.delete(17);
        intTree.traverseInOrder();
        System.out.println();
        // 2 children
        intTree.delete(25);
        intTree.traverseInOrder();
        System.out.println();

        // wrong input
        intTree.delete(1);
        intTree.traverseInOrder();
        System.out.println();
    }

}
