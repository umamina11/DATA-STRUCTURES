package Trees;

public class Tree {
    // need a root node
    private TreeNode root;

    public void insert(int value) {
        // if root is null then the element become root if not then look it should be
        // right or left child
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

}
