package nowCoder;

import java.util.Stack;

public class Main {
    public static String compress (String str) {
        // write code here
        char[]s=str.toCharArray();
        Stack<Character> stack=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length;i++){
            int count=1;
            int j=i+1;
            if(j<s.length&&s[j]!=s[i]){
                sb.append(String.valueOf(s[i]));
                sb.append(String.valueOf(count));
                    continue;
                }

            while(j<s.length&&s[j]==s[i]){
                count++;
                j++;
            }
            sb.append(String.valueOf(s[i]));
            sb.append(String.valueOf(count));
        }
        if(sb.length()>str.length()){
            System.out.println(str);
            return str;
        }else{
            System.out.println(sb);
            return String.valueOf(sb);
        }
    }
    private static int[] solution(int[][] weight, int start) {
        boolean[] visit = new boolean[weight.length]; // 标记某节点是否被访问过
        int[] res = new int[weight.length];     // 记录 start 点到各点的最短路径长度
        for (int i = 0; i < res.length; i++) {
            res[i] = weight[start][i];
        }

        // 查找 n - 1 次（n 为节点个数），每次确定一个节点
        for(int i = 1; i < weight.length; i++) {
            int min = Integer.MAX_VALUE;
            int p = 0;
            // 找出一个未标记的离出发点最近的节点
            for(int j = 0; j < weight.length; j++){
                if(j != start && !visit[j] && res[j] < min){
                    min = res[j];
                    p = j;
                }
            }
            // 标记该节点为已经访问过
            visit[p] = true;

            for (int j = 0; j < weight.length; j++){
                if (j == p || weight[p][j] == Integer.MAX_VALUE) {  // p 点不能到达 j
                    continue;
                }
                if (res[p] + weight[p][j] < res[j]){
                    res[j] = res[p] + weight[p][j];  //更新最短路径
                }
            }
        }

        return res;
    }
    public static int[][] convert (int[][] matrix) {
        // write code here
        int m= matrix.length;int n= matrix[0].length;
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]= matrix[m-1-i][j];
                matrix[m-1-i][j]=temp;
            }
        }
        for(int[]a:matrix){
            for(int b:a){
                System.out.print(b+"_");
            }
            System.out.println();
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][]matrix={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        convert(matrix);
 compress("abbccdddaaaa");
    }
}
