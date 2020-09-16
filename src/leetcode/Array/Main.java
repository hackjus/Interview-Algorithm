package leetcode.Array;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<String> stack = new Stack();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < s.length()) {
            int cnt = 0;
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
                cnt++;
            }
            sb.append(s.charAt(i));
            sb.append(cnt);
            i = j;
        }
        System.out.println(sb);
    }
}
