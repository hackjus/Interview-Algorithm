package leetcode.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
*
* 输入: intervals = [[1,3],[2,6],[8,10],[15,18]]
输出: [[1,6],[8,10],[15,18]]
解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
首先根据第一个字段排序；然后for循环；在每次循环里面；再for循环判断当前第二个元素与后面第一个元素的关系；当前arr[i][1]>arr[i+1][0];然后再比较
* arr[i][1]与arr[i+1][1]的关系；
*

著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class mergeIntervals_56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList();
        Arrays.sort(intervals,(int[]a,int[]b)->a[0]-b[0]);
        int i=0;
        int n= intervals.length;
        while (i<n){
            int left= intervals[i][0];
            int right=intervals[i][1];
            while(i<n-1&&right>=intervals[i+1][0]){
                right=Math.max(right,intervals[i+1][1]);
                i++;
            }
            list.add(new int[]{left, right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}
