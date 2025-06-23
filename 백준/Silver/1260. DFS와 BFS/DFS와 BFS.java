import java.util.*;
import java.io.*;

public class Main {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int x, boolean[] visited) {
        visited[x] = true;
        System.out.print(x + " ");
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]) {
                dfs(y, visited);
            }
        }
    }

    public static void bfs(int x, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x] = true;
        while(!queue.isEmpty()) {
            int y = queue.poll();
            System.out.print(y + " ");

            for (int i = 0; i < graph.get(y).size(); i++) {
                int z = graph.get(y).get(i);
                if(!visited[z]) {
                    queue.offer(z);
                    visited[z] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=1; i<=n; i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] dfsVisited = new boolean[n+1];

        dfs(v, dfsVisited);

        System.out.println();

        boolean[] bfsVisited = new boolean[n+1];

        bfs(v, bfsVisited);

    }
}
