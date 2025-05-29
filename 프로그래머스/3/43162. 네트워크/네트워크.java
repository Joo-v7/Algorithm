import java.util.*;

class Solution {
    public static int count = 0;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int x, int[][] computers, boolean[] visited) {
        visited[x] = true;
        
        for(int i=0; i<computers.length; i++) {
            if(computers[x][i] == 1 && !visited[i]) {
                dfs(i, computers, visited);
            }
        }
    }
}