package CodeTest;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        int[][] arr = new int[m + 1][2];
        for (int i = 0; i <= m; i++) {
            String s = in.nextLine();
            String s1[] = s.split(",");
            arr[i][0] = Integer.parseInt(s1[0]);
            arr[i][1] = Integer.parseInt(s1[1]);
        }
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                if (arr[i][0] >= arr[m][0] && arr[i][1] <= arr[m][1]) {
                    System.out.println(arr[i][0] + "," + arr[i][1]);
                }
            }
        } else {
            int start = arr[m][0];
            int end = arr[m][1];
            for (int i = 0; i < m; i++) {
//                if ((arr[i][0] >= arr[m][0] && arr[i][0] <= arr[m][1]) || (arr[i][1] <= end && arr[i][1] >= start)) {
                if (arr[i][1] < start || arr[i][0] > end) {
                } else {
                    System.out.println(arr[i][0] + "," + arr[i][1]);
                }
            }
        }

    }
}

