package Concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String d=new String("abc");
        String a="abc";
        String b="ab"+"c";
        String c=new String("ab")+"c";
        System.out.println(a==d);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int[]arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            min=Math.min(min,arr[i]);
        }
        int sum=0;
        sum+=min;
        List<Integer> res=new ArrayList<>();
      for(int k=0;k<arr.length-1;k++){

          while(k+1<arr.length&&arr[k]==arr[k+1]){
              k++;
          }
              res.add(arr[k]);

      }
//      for(int a:res){
//          System.out.println(a+"_");
//      }

        for(int i=0;i<res.size();i++ ){
            sum+=(res.get(i)-min);
        }
        System.out.println(sum);
    }
}
