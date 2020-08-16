package leetcode;

public class hasPathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){
            return false;
        }
        int remain=sum- root.val;
        if(root.left==null&&root.right==null){
            return remain==0;
        }
        return hasPathSum(root.left,remain)||hasPathSum(root.right,remain);
    }
        public static void main(String[] args) {

    }
}
