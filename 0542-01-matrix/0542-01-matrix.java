class Solution {
    public class Node{
        int x,y,step;
        Node(int x,int y,int step){
            this.x=x;
            this.y=y;
            this.step=step;
        }

    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        Queue<Node> q=new LinkedList<Node>();
        int vis[][]=new int[m][n];
        int dis[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!q.isEmpty()){
            int start=q.peek().x;
            int end=q.peek().y;
            int cost=q.peek().step;
            q.remove();

            dis[start][end]=cost;
            for(int i=0;i<4;i++){
                int a=start+drow[i];
                int b=end+dcol[i];

                if(a>=0 && b>=0 && a<m && b<n && vis[a][b]==0){
                    vis[a][b]=1;
                    q.add(new Node(a,b,cost+1));
                }
            }

        }
        return dis;
        
    }
}