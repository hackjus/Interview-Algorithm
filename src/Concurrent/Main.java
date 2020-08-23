package Concurrent;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
  class ListNode {
    int val;
    ListNode next;
      ListNode(int x) { val = x; }
  }
public class Main {

    public static void main(String[] args) {
        String a="ab";
        String b = "aa";
        System.out.println(a.compareTo(b));
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> res=new ArrayList<>();
        int k=in.nextInt();
        for(int i=0;i<n;i++){
            res.add(in.nextInt());
        }
        for(int i=0;i<res.size()-1;i++){
            if(i!=k-1){
                System.out.print(res.get(i)+" ");
            }
        }
        System.out.print(res.get(res.size()-1));
    }
}
