import java.util.Arrays;
import java.util.List;

public class BinaryTree {
    TreeNode root;

    BinaryTree(){
        root = null;
    }

   //method to insert a new node
   public void insert(int value){
    root = insertRec(root, value);
    
   }
// // Recursive method to insert a new node
   private TreeNode insertRec(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        if(value < root.value){
            root.left = insertRec(root.left, value);
        }else if(value > root.value){
            root.right = insertRec(root.right, value);
        }
        return root;

   }

   // in order traversal
    private void inOrder(){
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root){
        if(root != null){
            inOrderRec(root.left);
            System.out.println(root.value);
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(20);
        tree.insert(40);
        tree.insert(30);
        tree.insert(80);
        tree.insert(90);
        tree.insert(10);
        tree.insert(20);

        tree.inOrder();
    }
}
