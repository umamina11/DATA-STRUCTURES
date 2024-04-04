package Trees;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // tree node insertion
    public void insert(int value) {
        // checking duplicate value
        if (value == data) {
            return;
            // if not duplciate
            // if left child is there
        }
        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
                // have left child then loop will again run
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }

        }
    }

    // Traverse in Order
    // reading left child
    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.println("Data = " + data + " , ");
        // reading right child
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    // constructor for accepting values
    public TreeNode(int data) {
        this.data = data;
    }
    // getter and setter for above variables

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getrightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

}
