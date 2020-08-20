package nowCoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int dr[]={1,0,-1,0};
        int dc[]={0,1,0,-1};
        List<Integer> res=new ArrayList<>();
        int di=0;
        boolean[][] visited = new boolean[m][n];
        int r1=0;int c1=0;
        visited[0][0]=true;
        res.add(arr[0][0]);
        for(int i=0;i<m*n-1;i++){
            res.add
             if(r1>=0&&r1<m&&c1>=0&&c1<m&&!visited[r1][c1]){
                 res.add(arr[r1][c1]);
                 visited[r1][c1]=true;
             }else{
                 r1-=dr[di];
                 c1-=dc[di];
                 di=(di+1)%4;
                 r1+=dr[di];
                 c1+=dc[di];
                 res.add(arr[r1][c1]);
                 visited[r1][c1]=true;
             }
        }
        for(int a:res){
            System.out.printf(" "+a);
        }

    }
}
