public class BinaryTreeMerge {
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }

        TreeNode merged = new TreeNode(t1.value + t2.value);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }

    // Helper function to print the tree in order (for testing purposes)
    public static void printInOrder(TreeNode node) {
        if (node != null) {
            printInOrder(node.left);
          //  System.out.print(node.val + " ");
            printInOrder(node.right);
        }
    }

    public static void main(String[] args) {
        // Creating first tree
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        // Creating second tree
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        // Merging trees
        TreeNode mergedTree = mergeTrees(t1, t2);

        // Printing merged tree (In-order traversal)
        System.out.print("Merged Tree: ");
        printInOrder(mergedTree);
    }
}
