class Solution {
    public boolean canFinish(int n, int[][] pre) {
        int ind[]=new int[n];
        List<Integer>[] adj=new ArrayList[n];

        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] p:pre){
            adj[p[1]].add(p[0]);
            ind[p[0]]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(ind[i]==0)
            q.add(i);
        }

        int c=0;

        while(!q.isEmpty()){
            Integer node=q.peek();
            q.remove();
            c++;

            for(Integer y:adj[node]){
                ind[y]--;

                if(ind[y]==0)
                q.add(y);
            }
        }
        if(c==n)
        return true;
        else
        return false;
        
    }
}