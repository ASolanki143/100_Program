public class Program34 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        TreeNode root = sortedArrayToBST(arr, 0, arr.length-1);
        inOrder(root);
        System.out.println();
        System.out.println("Leaf Nodes : ");
        printLeafNode(root);
    }

    public static TreeNode sortedArrayToBST(int[] arr, int start, int end){
        if(start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid-1);
        node.right = sortedArrayToBST(arr, mid+1, end);

        return node;
    }

    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void printLeafNode(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
        }
        printLeafNode(root.left);
        printLeafNode(root.right);
    }

}

class TreeNode{
    int data;
    TreeNode left, right;

    public TreeNode(){
        this.data = 0;
        this.left = this.right = null;
    }

    public TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
