class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};
    public void dfs(int r,int c,char[][] board,int[][] vis){
        vis[r][c]=1;
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<4;i++){
            int x=r+drow[i];
            int y=c+dcol[i];

            if(x>=0 && x<m && y>=0 && y<n && board[x][y]=='O' && vis[x][y]==0)
            dfs(x,y,board,vis);
        }

    }

    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        int vis[][]= new int[m][n];

        for(int i=0;i<m;i++){
            if(vis[i][0]==0 && board[i][0]=='O')
            dfs(i,0,board,vis);

            if(vis[i][n-1]==0 && board[i][n-1]=='O')
            dfs(i,n-1,board,vis);
        }
        for(int j=0;j<n;j++){
            if(vis[0][j]==0 && board[0][j]=='O')
            dfs(0,j,board,vis);

            if(vis[m-1][j]==0 && board[m-1][j]=='O')
            dfs(m-1,j,board,vis);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && board[i][j]=='O')
                board[i][j]='X';
            }
        }


    }
}