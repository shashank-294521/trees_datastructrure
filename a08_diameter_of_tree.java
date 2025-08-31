

public class a08_diameter_of_tree {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }

    static int diametermax=0;
    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right.right=new TreeNode(6);
        root.right.right.right=new TreeNode(7);
        root.right.right.right.right=new TreeNode(8);

        diameter(root);
        System.out.println(diametermax);
        
    }
    public static int diameter(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=diameter(root.left);
        int rh=diameter(root.right);

        diametermax=Math.max(diametermax,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
