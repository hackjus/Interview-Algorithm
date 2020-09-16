package baidu;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1[] = s.split("\\s+");
        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                System.out.print(s1[i].charAt(j));
            }
            if (i != s1.length - 1) {
                System.out.print(" ");
            }
        }

    }
}
