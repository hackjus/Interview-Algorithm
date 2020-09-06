package leetcode.mostFrequently;

public class Main {
    //    https://www.nowcoder.com/questionTerminal/c623d940619940848d6576e7b5d6f66e
    public static int fn(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fn(n - 1) + fn(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fn(3));
    }
}
