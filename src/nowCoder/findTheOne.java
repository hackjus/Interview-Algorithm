package nowCoder;

import sun.font.CreatedFontTracker;

import java.util.Arrays;

public class findTheOne {
    public static int find(int[] arr, int k) {
        int res=0;
        for(int i:arr){
            if((i&(i-1))==0){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    /*
    输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]
输出: 3
解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。

链接：https://leetcode-cn.com/problems/russian-doll-envelopes
*/

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,(int[]a,int[]b)->{
            return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
        });

        return  12;
    }


        public static void main(String[] args) {
        int[]arr={1,3,5,7};
        find(arr,3);
    }
}
