import java.util.*;

class Solution {
    static Set<Integer> result = new HashSet<>();
    
    public int solution(String numbers) {
        int count = 0;
        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers, "", visited);
        
        for(int n : result) {
            if(isPrime(n)) {
                count++;
            }
        }
        
        return count;
        
    }
    
    static void dfs(String numbers, String current, boolean[] visited) {
        if(!current.isEmpty()) {
            result.add(Integer.parseInt(current));
        }
        
        for(int i=0; i<numbers.length(); i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), visited);
                visited[i] = false;
            }
        }
    }
    
    static boolean isPrime(int n) {
        if(n<2) return false;
        
        for(int i = 2; i*i<=n; i++) {
            if(n%i == 0) return false;
        }
        
        return true;
    }
}