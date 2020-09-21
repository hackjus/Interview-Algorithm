package CodeTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public static String decodeString(String s) {
        if (s.length() == 0)
            return s;

        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> tmpList = new ArrayList<>();    // 操作局部字符串

        int i, j, num, k;

        for (i = 0; i < s.length(); i++) {
            stack.push(ch[i]);

            if (stack.peek() == ']') {            // 处理局部字符串,局部出栈再入栈
                stack.pop();                    // ']'出栈
                while (stack.peek() != '[') {
                    tmpList.add(stack.pop());    //	字母出栈并记录, tmpList中为逆序
                }

                stack.pop();                    // '['出栈
                num = 0;                        // 记录数字
                k = 0;
                // 从左往右，将字符拼装成数字
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    num = (int) ((stack.pop() - '0') * Math.pow(10, k) + num);
                    k++;
                }

                while (num != 0) {                // n倍字母
                    for (j = tmpList.size() - 1; j >= 0; j--)  // 再逆序入栈，
                        stack.push(tmpList.get(j));
                    num--;
                }
            }

            tmpList.clear();
        }

        StringBuilder sb = new StringBuilder();
        for (j = 0; j < stack.size(); j++)
            sb.append(stack.elementAt(j));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.isEmpty()) {
            System.out.println("");
        }
        System.out.println(decodeString(s));

    }
}
