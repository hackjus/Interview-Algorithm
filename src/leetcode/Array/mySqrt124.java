//package leetcode.Array;
//
//public class mySqrt124 {
//    public int mySqrt(int x) {
//        if (x < 2) return;
//        long num;
//        int pivot, left = 2, right = x / 2;
//        pivot = left + (right - left) / 2;
//        num = (long) pivot * pivot;
//        if (num > x) {
//            right = pivot - 1;
//        } else if (num < x) {
//            left = pivot + 1;
//        } else {
//            return pivot;
//        }
//        return -1;
//    }
//
//
//}
