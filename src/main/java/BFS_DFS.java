import java.util.ArrayDeque;
import java.util.Queue;

public class BFS_DFS {
    public static void bfs(int[][] graph, int node, int[] bfsvis){
        if(bfsvis[node]==1){
            return;
        }
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        bfsvis[node] = 1;
        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr+" ");
            for(int i: graph[curr]){
                if(bfsvis[i]==0){
                    q.add(i);
                    bfsvis[i] = 1;
                }
            }
        }
        System.out.println();
    }
    public static void dfs(int[][] graph, int node, int[] dfsvis){
        if(dfsvis[node]==1){
            return;
        }
        dfsvis[node] = 1;
        System.out.print(node+" ");
        for(int i=0;i<graph[node].length;i++){
            dfs(graph, graph[node][i], dfsvis);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
                {1, 2, 3, 4},
                {0, 2, 3, 5},
                {0, 1, 5, 3},
                {0, 1, 2, 4},
                {0, 3, 5},
                {1, 2, 4}
        };
        int[] bfsvis = new int[graph.length];
        int[] dfsvis = new int[graph.length];
        System.out.println("BFS TRAVERSAL: ");
        for(int i=0;i<graph.length;i++){
            if(bfsvis[i]==0){
                bfs(graph, i, bfsvis);
            }
        }
        System.out.println("DFS TRAVERSAL: ");
        dfs(graph, 0, dfsvis);
    }
}
