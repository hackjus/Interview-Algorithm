//package CodeTest;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Main1 {
//    public static void fn(int n) {
//        if (n == 1) {
//            System.out.println(n);
//        } else {
//            for (int i = 2; i <= n; i++) {
//                if (n % i == 0) {
//                    if (i == n) {
//                        System.out.print(i);
//                        break;
//                    } else {
//                        System.out.println(i);
//                        fn(n / i);
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//    public boolean testMatch(String pattern, String str) {
//        if (pattern == null || str == null) return false;
//        String[] string = str.split(" ");
//        if (pattern.length() != string.length) return false;
//        Map<Character, String> map = new HashMap<>();
//
//        for (int i = 0; i < pattern.length(); i++) {
//            char tmp = pattern.charAt(i);
//            if (map.get(tmp) != null) {
//                if (!map.get(tmp).equals(string[i])) return false;
//            } else {
//                map.put(tmp, string[i]);
//            }
//        }
//        return true;
//    }
//
//}
//
//    public void nextPermutation(int[] nums) {
//        int i = nums.length - 2;
//        while (i >= 0 && nums[i + 1] <= nums[i]) {
//            i--;
//        }
//        if (i >= 0) {
//            int j = nums.length - 1;
//            while (j >= 0 && nums[j] <= nums[i]) {
//                j--;
//            }
//            swap(nums, i, j);
//        }
//        reverse(nums, i + 1);
//    }
//
//    private void reverse(int[] nums, int start) {
//        int i = start, j = nums.length - 1;
//        while (i < j) {
//            swap(nums, i, j);
//            i++;
//            j--;
//        }
//    }
//
//    private void swap(int[] nums, int i, int j) {
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = temp;
//    }
//
//    public int findGreaterNum(int N) {
//        // write code here
//        List<Integer> res = new ArrayList<>();
//        int temp = N;
//        while (temp != 0) {
//            res.add(0, temp % 10);
//            temp /= 10;
//        }
//        int[] nums = new int[res.size()];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = res.get(i);
//        }
//        for (int a : nums) {
//            System.out.println(a);
//        }
//        nextPermutation(nums);
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < nums.length; i++) {
//            sb.append(nums[i]);
//        }
//        System.out.println(sb);
//        int a = Integer.parseInt(String.valueOf(sb));
//        System.out.println(a < 532);
//        if (a < N) {
//            return -1;
//        } else {
//            return a;
//        }
//    }
//
//    public static void main(String[] args) {
//        new Main1().findGreaterNum(432);
//
//
//    }
//}
