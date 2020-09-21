package CodeTest;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1[] = s.split(",");
        int[] res = new int[s1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(s1[i]);
        }
        int k = in.nextInt();
        
    }
}
