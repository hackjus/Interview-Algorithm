package baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 7, 9};
        System.out.println(Arrays.binarySearch(x, 5));
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] cost = new int[n];
            for (int j = 0; j < cost.length; j++) {
                cost[j] = in.nextInt();
            }
            int[] arr = new int[m];
            for (int a = 0; a < arr.length; a++) {
                arr[a] = in.nextInt();
            }
            Arrays.sort(arr);
            List<Integer> res = new ArrayList<>();
            for (int b = 0; b < cost.length; b++) {
                int index = Arrays.binarySearch(arr, cost[b]);
                if (index == -1 || -index > arr.length) {
                    res.add(0);
                } else if (index >= 0 && index < arr.length) {
                    res.add(arr.length - index);
                } else {
                    res.add(arr.length + index + 1);
                }
//                int cnt = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (arr[j] >= cost[b]) {
//                        cnt++;
//                    }
//                }
//                res.add(cnt);
            }

            for (int b1 = 0; b1 < res.size() - 1; b1++) {
                System.out.print(res.get(b1) + " ");
            }
            System.out.print(res.get(res.size() - 1));
        }
    }

}
