package leetcode.mostFrequently;

import java.util.Arrays;

public class Main {
    //    https://www.nowcoder.com/questionTerminal/c623d940619940848d6576e7b5d6f66e
    public static int fn(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fn(n - 1) + fn(n - 2);
    }

    public static int[] merge1(int[] arr1, int n, int[] arr2, int m) {
        int res[] = new int[m + n];
        for (int i = 0; i < n; i++) {
            res[i] = arr1[i];
        }
        for (int i = n; i < n + m; i++) {
            res[i] = arr2[i];
        }
        Arrays.sort(res);
        for (int a : res) {
            System.out.println(a);
        }
        return res;

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
        for (int a : nums1) {
            System.out.println(a);
            return nums1;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {6};
        System.out.println(merge(arr1, 4, arr2, 1));

    }


}
