package CodeTest;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main6 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(Math.random() * 5));
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] weightArray = new int[n];
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            String s1[] = s.split(",");
            weightArray[i] = Integer.parseInt(s1[0]);
            treeMap.put(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
        }


        int num;
        int store;
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            int key = (int) Math.ceil(Math.random() * 5);
            System.out.println(treeMap.get(key));
        }


    }
}
