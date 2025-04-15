import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int type = nums.length/2;
        int answer = 0;
        
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        if(map.keySet().size() < type) {
            answer = map.keySet().size();
        } else {
            answer = type;
        }
        
        return answer;
    }
}