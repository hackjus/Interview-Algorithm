package leetcode.DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
    public int val;
    public Node next;

    public Node(int data) {
        this.val = data;
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        Node dummy = new Node(0);
        Node current1 = dummy;
        for (int i = 0; i < n; i++) {
            Node cur = new Node(in.nextInt());
            dummy.next = cur;
            dummy = cur;
        }
        dummy.next = null;
        int n1 = in.nextInt();
        Node dummy1 = new Node(0);
        Node current2 = dummy1;
        in.nextLine();
        for (int i = 0; i < n1; i++) {
            Node cur = new Node(in.nextInt());
            dummy1.next = cur;
            dummy1 = cur;

        }
        dummy1.next = null;
        Node head1 = current1.next;
        Node head2 = current2.next;
//        while (head1 != null) {
//            System.out.println(head1.val);
//            head1 = head1.next;
//        }
//        while (head2 != null) {
//            System.out.println(head2.val);
//            head2 = head2.next;
//        }
        List<Integer> res = new ArrayList<>();
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head2 = head2.next;
            } else if (head1.val > head2.val) {
                head1 = head1.next;
            } else {
                res.add(head1.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.print(res.get(res.size() - 1));
    }
}
