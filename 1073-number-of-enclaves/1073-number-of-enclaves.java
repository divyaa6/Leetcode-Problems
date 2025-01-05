class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,1,0,-1};

    public void dfs(int r,int c,int[][] grid,int[][] vis){
        vis[r][c]=1;
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<4;i++){
            int x=r+drow[i];
            int y=c+dcol[i];

            if(x>=0 && x<m && y>=0 && y<n && grid[x][y]==1 && vis[x][y]==0){
                grid[x][y]=0;
                dfs(x,y,grid,vis);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int vis[][]=new int[m][n];
        int c=0;

        for(int i=0;i<m;i++){
            if(grid[i][0]==1 && vis[i][0]==0)
            dfs(i,0,grid,vis);

            if(grid[i][n-1]==1 && vis[i][n-1]==0)
            dfs(i,n-1,grid,vis);
        }

        for(int j=0;j<n;j++){
            if(grid[0][j]==1 && vis[0][j]==0)
            dfs(0,j,grid,vis);

            if(grid[m-1][j]==1 && vis[m-1][j]==0)
            dfs(m-1,j,grid,vis);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0)
                c++;
            }
        }
        return c;

        
    }
}