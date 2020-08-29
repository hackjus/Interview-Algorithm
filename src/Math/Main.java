package Math;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        while (in.hasNext()){
//            int n=in.nextInt();
//            in.nextLine();
//            String s=in.nextLine();
//            String[]s1=s.split(" ");
//            int[]a=new int[s1.length];
//            for(int i=0;i<a.length;i++){
//                a[i]=Integer.valueOf(s1[i]);
//            }
//            Stack<Integer> stack=new Stack<>();
//            int max=1;
//            for(int i=0,j=1;j<a.length;j++){
//               if(a[j]-a[i]==0){
//                   i++;
//                   System.out.println(1);
//               }
//               while(a[j]-a[i]==1){
//                   j++;
//                   i++;
//
//               }
//            }
//            System.out.println(a.length-2);

        int n=in.nextInt();
        int k=in.nextInt();
        in.nextLine();
        String s=in.nextLine();
        String[]s1=s.split(" ");
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s1[i]);
        }
        int maxCost=0;
        int maxCarry=0;
        if(n/k==2){
           for(int i=0;i<n;i+=2){
               maxCost+=(arr[i]+arr[i+1])*(arr[i]+arr[i+1]);
               maxCarry=Math.max((arr[i]+arr[i+1]),maxCarry);
           }
            System.out.print(maxCost+" "+maxCarry);
        }111


    }
}
