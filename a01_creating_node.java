public class a01_creating_node {
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
    TreeNode root=new TreeNode(1);
    root.left=new TreeNode(2);
    root.right=new TreeNode(3);
    root.left.left=new TreeNode(4);

    root.right.right=new TreeNode(5);

    System.out.println(root.data);
    System.out.println(root.left.data);
    System.out.println(root.right.data);
    System.out.println(root.left.left.data);
    System.out.println(root.right.right.data);
    System.out.println(root.right.data);

   }    
}
