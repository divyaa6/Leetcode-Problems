class Solution {
    public boolean dfs(int v, int[][] graph, int[] vis, int col) {
        vis[v] = col;  // Color the current node

        for (int i : graph[v]) {
            // If the adjacent node is already colored and it has the same color as the current node, return false
            if (vis[i] == vis[v]) {
                return false;
            }

            // If the adjacent node is not colored, color it with the opposite color and continue DFS
            if (vis[i] == 0) {
                if (!dfs(i, graph, vis, 3 - col)) {
                    return false;  // If any subtree returns false, the graph is not bipartite
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];  // Initialize all nodes as unvisited (0)

        // Try to color each component (not just starting from node 0)
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {  // If this node is unvisited
                if (!dfs(i, graph, vis, 1)) {
                    return false;  // If any component is not bipartite, return false
                }
            }
        }
        return true;  // All components are bipartite
    }
}
