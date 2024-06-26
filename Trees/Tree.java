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

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    // DELETE
    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getrightChild(), value));
        } else {
            // cases 0 child and 1 childnode to delete has 0 or 1 child
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getrightChild();
            } else if (subtreeRoot.getrightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // case 3 when node have 2 children
            // find the minium value in right subtree
            // relace the value in the subtree node with the smallest value in the right
            // subtree
            subtreeRoot.setData(subtreeRoot.getrightChild().min());
            // delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getrightChild(), subtreeRoot.getData()));

        }
        return subtreeRoot;
    }

    // MIN & MAX

    public int min() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

}
