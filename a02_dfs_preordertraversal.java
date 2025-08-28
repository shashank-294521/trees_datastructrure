import java.util.ArrayList;
import java.util.List;

public class a02_dfs_preordertraversal {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        root.right.left.left = new TreeNode(10);

    //          1
    //       /   \
    //      2     3
    //    /  \   / \
    //   4    5 6   7
    //  / \     /
    // 8   9   10


        List<Integer> list=new ArrayList<>();

        preorder(root, list);
        System.out.println(list);
    }
    public static void preorder(TreeNode root,List<Integer> list){
        if(root==null){
            return; 
        }

        list.add(root.data);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}
