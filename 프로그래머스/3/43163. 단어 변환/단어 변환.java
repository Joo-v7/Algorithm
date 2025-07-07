import java.util.*;

class Solution {
    
    static boolean[] visited;
    
    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();
        visited = new boolean[words.length];
        
        for(int i=0; i<words.length; i++) {
            if(canConvert(begin, words[i])) {
                visited[i] = true;
                queue.add(words[i]);
            }
        }
        
        int count = 1;
        
        while(!queue.isEmpty()) {
            
            int size = queue.size();
            for(int s=0; s<size; s++) {
                String cur = queue.poll();
                
                if(cur.equals(target)) {
                return count;
                }
                
                for(int i=0; i<words.length; i++) {
                    if(!visited[i] && canConvert(cur, words[i])) {
                            visited[i] = true;
                            queue.add(words[i]);
                    }
                }
                
            }
    
            count++;
        }
        
        return 0;
        
    }
    
    static boolean canConvert(String from, String to) {
        int cnt = 0;
        for(int i=0; i<from.length(); i++) {
            if(from.charAt(i) == to.charAt(i)) {
                cnt++;
            }
        }
        
        return from.length() == cnt+1 ? true:false;
    }
    
  
}