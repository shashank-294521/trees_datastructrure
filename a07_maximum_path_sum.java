public class a07_maximum_path_sum {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static int max=0;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(-10);

        root.left=new TreeNode(9);
        root.right=new TreeNode(20);

        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        // we have to find the maximum path sum
        max=Integer.MIN_VALUE;
        maxsum(root);
        System.out.println(max);

    }
    public static int maxsum(TreeNode root){
        if(root==null){
            return 0;
        }
       int leftsum=maxsum(root.left);
       int rightsum=maxsum(root.right);
       max=Math.max(max,leftsum+rightsum+root.data);
       return root.data+Math.max(leftsum,rightsum);

    }
}
