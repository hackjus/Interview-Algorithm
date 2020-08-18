package leetcode;

public class DFS_exist_79 {
    public boolean exist(char[][] board, String word) {
            char[]words=word.toCharArray();
            for(int i=0;i< board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(dfs(board,i,j,words,0)){
                        return  true;
                    }
                }
            }
            return  false;
    }
    public boolean dfs(char[][]board,int i,int j,char[]words,int start){
        if(start<0||start>= words.length||i<0||i>= board.length||j<0||j>=board[0].length||board[i][j]!= words[start]){
            start=0;
            return  false;
        }
        if(start== words.length){
            return  true;
        }
        board[i][j]^=256;
        boolean exist=dfs(board,i+1,j,words,start+1)||dfs(board,i,j+1,words,start+1)||dfs(board,i-1,j,words,start+1)||
                dfs(board,i,j-1,words,start);
        board[i][j]^=256;
        return  exist;
    }

}
