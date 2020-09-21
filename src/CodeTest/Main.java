package CodeTest;


import java.util.Scanner;

public class Main {
    //动态规划最长公共子序列；
    public static int max1(String text1, String text2) {
        int table[][] = new int[text1.length() + 1][text2.length() + 1];

        for (int col = 0; col < table[0].length; col++) {
            table[0][col] = 0;
        }

        for (int row = 0; row < table.length; row++) {
            table[row][0] = 0;
        }

        for (int row = 1; row < table.length; row++) {
            char ch1 = text1.charAt(row - 1);
            for (int col = 1; col < table[row].length; col++) {
                char ch2 = text2.charAt(col - 1);
                if (ch1 == ch2) {
                    table[row][col] = table[row - 1][col - 1] + 1;
                } else {
                    table[row][col] = Math.max(table[row - 1][col], table[row][col - 1]);
                }
            }
        }

        int[] lastRow = table[table.length - 1];
        return lastRow[lastRow.length - 1];
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(max1(s1, s2));
    }
}

