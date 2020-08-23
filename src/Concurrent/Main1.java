package Concurrent;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int  n=in.nextInt();
        long max=0;
        while (n>0){
            long n1=in.nextLong();
            for(long i=1;i<n1;i++){
                max=Math.max(max,getsum(i,n1-i));
            }
            System.out.println(max);
       }
    }
    public  static  long getsum(long a,long b){
        long sum=0;
        while (a!=0) {
            sum+=a%10;
            a=a/10;
        }
        while (b!=0){
            sum+=b%10;
            b=b/10;
        }
        return  sum;
    }
}
