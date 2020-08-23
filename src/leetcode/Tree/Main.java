package leetcode.Tree;

import java.util.Stack;

public class Main {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    boolean isSymmetrical(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;
        return isSymmetrical(t1.left, t2.right) && isSymmetrical(t1.right, t2.left);
    }

    /*树的子结构*/
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return fn(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);

    }

    public boolean fn(TreeNode root1, TreeNode root2) {
        if (root1.val != root2.val) {
            return false;
        }

        return fn(root1.left, root2.left) && fn(root1.right, root2.right);
    }

    //    二叉树的镜像
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null) {
            mirrorTree(root.left);
        }
        if (root.right != null) {
            mirrorTree(root.right);
        }
        return root;
    }

    private  TreeNode ret;
    private  int cnt=0;
    TreeNode KthNode(TreeNode pRoot, int k){
        inorder(pRoot,k);
        return ret;
    }

    private void inorder(TreeNode root, int k) {
        if(root==null||cnt>=k){
            return;
        }
        inorder(root.left, k);
        cnt++;
        if(cnt==k){
            ret=root;
        }
        inorder(root.right,k);
    }
    TreeNode kthNode(TreeNode root,int k) {
        Stack<TreeNode> stack = new Stack<>();
        int cnt = 0;
        while (!stack.isEmpty()&&root!=null) {
            if (root!= null) {
                stack.push(root);
                root = root.left;
            }else{
                TreeNode root1 = stack.pop();
                cnt++;
                if (cnt == k) {
                    return root1;
                }
                root=root1.right;
            }


        }
        return new TreeNode(-1);
    }

}
