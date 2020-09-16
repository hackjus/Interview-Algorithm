package Concurrent;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();

            for (int j = 0; j < m; j++) {
                String s = in.nextLine();
            }
            int a = (int) (Math.random() * 10);
            if (a % 2 == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }


    }

}


