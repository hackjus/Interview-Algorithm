package baidu;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1[] = s.split("]");
        int target = Integer.parseInt(s1[1].substring(1, 2));
        String s2 = s1[0].substring(1, s1[0].length());
        String s3[] = s2.split(",");
        int[] arr = new int[s3.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s3[i]);
        }

        System.out.println(bineary(arr, target));
    }

    public static int bineary(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int pivot = (i + j) / 2;
            if (arr[pivot] == target) {
                return pivot;
            } else if (arr[pivot] > target) {
                j = pivot - 1;
            } else {
                i = pivot + 1;
            }
        }
        return -1;
    }
}
