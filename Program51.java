public class Program51 {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(15);

        Integer secondSmallest = findSecondSmallest(root);
        if(secondSmallest != null){
            System.out.println("Second smallest element in the BST is: " + secondSmallest);
        } else {
            System.out.println("No second smallest element found.");
        }
    }

    public static Node findMin(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Integer findSecondSmallest(Node root){
        if(root == null || (root.left == null && root.right == null)){
            return null;
        }

        Node curr = root;
        Node parent = null;

        while(curr.left != null){
            parent = curr;
            curr = curr.left;
        }

        if(curr.right != null){
            return findMin(curr.right).data;
        }

        return parent != null ? parent.data : null;
    }
}

class Node{
    int data;
    Node left, right;

    public Node(){
        data = 0;
        left = right = null;
    }
    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
