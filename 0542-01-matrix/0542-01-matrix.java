class Solution {
    class Pair{
        int x,y,step;
        Pair(int i,int j,int s){
            this.x=i;
            this.y=j;
            this.step=s;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int vis[][]=new int[m][n];
        int dis[][]=new int[m][n];
        Queue<Pair> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=1;
                }
                else
                vis[i][j]=0;
            }
        }

        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        while(!q.isEmpty()){
            int first=q.peek().x;
            int second=q.peek().y;
            int step=q.peek().step;
            q.remove();
            dis[first][second]=step;

            for(int i=0;i<4;i++){
                int a=first+drow[i];
                int b=second+dcol[i];

                if(a>=0 && a<m && b>=0 && b<n && vis[a][b]==0){
                    vis[a][b]=1;
                    q.add(new Pair(a,b,step+1));
                }
            }
        }

    return dis; 
    }
}