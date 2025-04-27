import java.util.ArrayList;

public class Program61 {

    TreeNode prev = null;
    int count = 0;
    int maxCount = 0;
    ArrayList<Integer> nodes = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {
            1,2,2,3,4,5,6,7,7,8,9
        };

        TreeNode root = sortedArrayToBST(arr, 0, arr.length - 1);
        Program61 tree = new Program61();
        int[] ans = tree.findMaxNodes(root);
        System.out.println("Max Occurring Nodes: ");
        for(int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public int[] findMaxNodes(TreeNode root){
        inOrderForFindNode(root);
        int[] ans = new int[nodes.size()];
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = nodes.get(i);
        }
        return ans;
    }

    public void inOrderForFindNode(TreeNode root){
        if(root == null) return;
        inOrderForFindNode(root.left);

        if(prev != null && prev.data == root.data) count++;
        else count = 1;

        if(count > maxCount){
            nodes.clear();
            maxCount = count;
            nodes.add(root.data);
        }
        else if(count == maxCount){
            nodes.add(root.data);
        }

        prev = root;
        inOrderForFindNode(root.right);
    }

    public static TreeNode sortedArrayToBST(int[] arr, int start, int end){
        if(start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid-1);
        node.right = sortedArrayToBST(arr, mid+1, end);

        return node;
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
        this();
        this.data = data;
    }
}
