
public class BinaryTree {

   Node root;

  BinaryTree() {
        root = null;
    }
   
    void printPostOrder(Node node){
        if(node==null){
            return;
        }
        
        printPostOrder(node.left);
             printPostOrder(node.right);
             System.out.println(node.key+" ");
    }
    void printInOrder(Node node){
        if(node==null){
            return;
        }
        printInOrder(node.left);
        System.out.println(node.key+" ");
         printInOrder(node.right);
        
    }
    
    void printPerOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.key+" ");
        printPerOrder(node.left);
           printPerOrder(node.right);
    }
    void printPostOrder() {
        printPostOrder(root);
    }

    void printInOrder() {
        printInOrder(root);
    }

    void printPreOrder() {
        printPerOrder(root);
    }
        public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

      //  System.out.println("Preorder traversal of binary tree is ");
      //  tree.printPerOrder();

        System.out.print("\nInorder traversal of binary tree is ");
        tree.printInOrder();

        System.out.print("\nPostorder traversal of binary tree is ");
        tree.printPostOrder();
    }
}
