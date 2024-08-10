public class BinaryTree1 {
    
    TreeNode1 root;
    public BinaryTree1() {
        root = null;
    }

    //add a node
   public void insert(int value){
        root = insertRec(root, value);
    }

    //method to insert a node

    public TreeNode1 insertRec(TreeNode1 root, int value){
        if(root == null){
            root = new TreeNode1(value);
            return root;
        }

        if(value < root.value){
            root.left = insertRec(root.left, value);
        }else if(value > root.value){
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    //in order traversal of the the tree
    public void inOrder(){
        inOrderRec(root);
    }

    public void inOrderRec(TreeNode1 root){

        if(root != null){
            inOrderRec(root.left);
            System.out.println(root.value);
            inOrderRec(root.right);
        }
    }






   public static void main(String[] args) {
        BinaryTree1 bt = new BinaryTree1();
        bt.insert(30);
        bt.insert(20);
        bt.insert(10);
        bt.insert(50);
        bt.insert(60);
        bt.insert(90);
        bt.insert(80);
        bt.insert(60);

        bt.inOrder();


        
    }


    public TreeNode mergTreeNode(TreeNode t1, TreeNode t2){
        if(t1==null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }

        TreeNode merged = new TreeNode(t1.value+t2.value);
        merged.left = mergTreeNode(t1.left, t2.left);
        merged.right = mergTreeNode(t1.right, t2.right);

        return merged;
    }

}
