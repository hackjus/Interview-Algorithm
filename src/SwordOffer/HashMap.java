package SwordOffer;

import java.util.HashSet;

public class HashMap {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        if(s.length()==0){
            return  0;
        }
        int n=s.length();
        int i=0,j=0;
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return  ans;
    }
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return  false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashMap one=new HashMap();
        boolean flag = one.isPalindrome(121);
        System.out.println(flag);
    }
}
