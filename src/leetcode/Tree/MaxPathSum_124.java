package leetcode.Tree;
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class MaxPathSum_124 {
   int maxValue;
   public int maxPathSum(TreeNode root){
      maxValue=Integer.MIN_VALUE;
      dfs(root);
      return  maxValue;
   }
   public int dfs(TreeNode root){
      if(root==null) return 0;
      int left=Math.max(0,dfs(root.left));
      int right= Math.max(0,dfs(root.right));
      maxValue=Math.max(maxValue,left+right+ root.val);
      return root.val+Math.max(left,right);
   }
}
