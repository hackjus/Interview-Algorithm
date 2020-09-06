package leetcode.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode_199 {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode root1 = queue.poll();
                if (root1.left != null) {
                    queue.add(root1.left);
                }
                if (root1.right != null) {
                    queue.add(root1.right);
                }
                if (i == size - 1) {
                    res.add(root1.val);
                }
            }
        }
        return res;
    }

}
