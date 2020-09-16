package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder_103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        queue.offer(root);
        int index = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size > 0) {
                TreeNode current = queue.poll();
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
                if (index % 2 == 1) {
                    temp.add(0, current.val);
                } else {
                    temp.add(current.val);
                }
                size--;
            }
            res.add(temp);
            index++;
        }
        return res;
    }

    int solution(int n) {
        // write code here
        int ans = 0;
        for (int i = 1; n > 0; ++i) {
            ans += i * Math.min(i, n);
            n -= i;
        }
        return ans;
    }


    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res.add(0, 12);
        res.add(0, 34);
        for (int a : res) {
            System.out.println(a);
        }
    }
}
