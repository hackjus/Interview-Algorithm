package nowCoder;

import java.util.*;
public class Mian1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            // stack维持的是一个单调递减的栈，
            // 如果当前元素比栈顶大，则当前元素作为最大值向前组成子序列，次大值依次为出栈的栈顶元素
            while (!stack.isEmpty() && stack.peek() <= x){
                res = Math.max(res, x ^ stack.pop());
            }
            // 如果stack非空，此时栈顶元素大于当前元素x，
            // 当前元素为次大值，栈顶为最大值计算异或值
            if (!stack.isEmpty()){
                res = Math.max(res, x ^ stack.peek());
            }
            stack.push(x);
        }
        System.out.println(res);
    }
}