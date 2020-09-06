package leetcode.mostFrequently;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DP {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs(res, new ArrayList<>(), root, sum);
        return res;
    }

    public void dfs(List<List<Integer>> res, ArrayList<Integer> temp, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            res.add(temp);
            return;
        } else {
            int remain = sum - root.val;
            dfs(res, temp, root.left, remain);
            dfs(res, temp, root.right, remain);
        }

    }

    private int count = 0;

    public int countNodes(TreeNode root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        count++;
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode root1 = queue.poll();
            for (int i = 0; i < size; i++) {
                if (root1.left != null) {
                    queue.add(root1.left);
                    count++;
                }
                if (root1.right != null) {
                    queue.add(root1.right);
                    count++;
                }
            }
        }
        return count;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        dfs2(root, res, "");
        return res;
    }

    public void dfs2(TreeNode root, List<String> res, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(s);
            return;
        }
        dfs2(root.left, res, root.val + "->");
        dfs2(root.right, res, root.val + "->");
    }
}
