package baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sheep {
    public int age = 0;
}

public class Main5 {
    public static int get(int start, int start2, int end, int year) {
        int num = 1;    //The initial sheep number

        for (int i = 1; i <= year; i++) {
            if (i == start) {
                num += get(start, start2, end, year - 2);
            } else if (i == start2) {
                num += get(start, start2, end, year - 4);
            } else if (i == end) {
                num--;
            }
        }

        return num;
    }

    public static int getSheeps(int n) {
        ArrayList<Sheep> sheeps = new ArrayList<Sheep>();
        sheeps.add(new Sheep());

        List<Sheep> addSheeps = new ArrayList<Sheep>();
        List<Sheep> delSheeps = new ArrayList<Sheep>();

        for (int i = 1; i <= n; i++) {
            for (Sheep s : sheeps) {
                s.age++;
                if (s.age == 2 || s.age == 4) {
                    addSheeps.add(new Sheep());
                } else if (s.age == 5) {
                    delSheeps.add(s);
                }
            }

            sheeps.addAll(addSheeps);
            sheeps.removeAll(delSheeps);
            addSheeps.clear();
            delSheeps.clear();
        }

        return sheeps.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int m1 = in.nextInt();
        int year = in.nextInt();
        System.out.println(get(n, m, m1, year));
        System.out.println(getSheeps(10));

    }
}
