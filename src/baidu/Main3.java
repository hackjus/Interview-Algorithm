package baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int start = in.nextInt();
        int end = in.nextInt();
        List<Integer> cycle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cycle.add(arr[i]);
        }
        for (int i = n - 2; i > 0; i--) {
            cycle.add(arr[i]);
        }
        start = (start % cycle.size());
        end = start + end;
        for (int i = start; i < end; i++) {
            System.out.println(cycle.get(i % cycle.size()));
        }

        int round = (end - start) / cycle.size();
        if (end > cycle.size() - 1 && start >= cycle.size()) {

        }
    }
}
