package leetcode.Array;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.nextLine();
        for (int i = 0; i < k; i++) {
            Stack<Integer> stackleft = new Stack<>();
            Stack<Integer> stackright = new Stack<>();
            int n1 = in.nextInt();
            in.nextLine();
            int sum1 = 0;
            for (int j = 0; j < n1; j++) {
                String s = in.nextLine();
                String s1[] = s.split(" ");
                if (s.contains("left take")) {
                    stackleft.push(arr[Integer.parseInt(s1[2]) - 1]);
                } else if (s.contains("right take")) {
                    stackright.push(arr[Integer.parseInt(s1[2]) - 1]);
                } else if (s.contains("left return")) {

                    int value = stackleft.pop();
//                    arr[Integer.parseInt(s1[2]) - 1] = value;
                } else if (s.contains("right return")) {
                    int value = stackright.pop();
//                    arr[Integer.parseInt(s1[2]) - 1] = value;
                } else if (s.contains("right keep")) {
                    sum1 += stackright.pop();
                } else if (s.contains("left keep")) {
                    sum1 += stackleft.pop();
                }
            }
            while (!stackleft.isEmpty()) {
                sum1 += stackleft.pop();
            }
            while (!stackright.isEmpty()) {
                sum1 += stackright.pop();
            }
            System.out.println(sum1);
        }
    }
}
