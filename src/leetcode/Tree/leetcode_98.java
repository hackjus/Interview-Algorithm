package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode_98 {
    List<Integer> res = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        res = inorderTraversal(root);
        for (int i = 1; i < res.size(); i++) {
            if (res.get(i) < res.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode temp = stack.pop();
            }
        }
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }

}
