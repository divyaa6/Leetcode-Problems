class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int visited[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0 && visited[i][j]!=1){
                    for(int l=0;l<n;l++){
                        if(matrix[l][j]!=0){
                        matrix[l][j]=0;
                        visited[l][j]=1;
                        }
                    }
                    for(int l=0;l<m;l++){
                        if(matrix[i][l]!=0){
                        matrix[i][l]=0;
                        visited[i][l]=1;
                        }
                    }
                }
            }
        }
        
    }
}