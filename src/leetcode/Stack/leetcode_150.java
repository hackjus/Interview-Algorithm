package leetcode.Stack;

import java.util.Stack;

public class leetcode_150 {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();
        int op1, op2;
        for (String s : tokens) {
            switch (s) {
                case "+":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 + op2);
                    break;
                case "-":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 - op2);
                    break;
                case "*":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 * op2);
                    break;
                case "/":
                    op2 = numStack.pop();
                    op1 = numStack.pop();
                    numStack.push(op1 / op2);
                    break;
                default:
                    numStack.push(Integer.valueOf(s));
                    break;
            }
        }
        return numStack.peek();

    }


    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[]res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int cnt=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    res[i]=cnt;
                    break;
                }else{
                    cnt++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
