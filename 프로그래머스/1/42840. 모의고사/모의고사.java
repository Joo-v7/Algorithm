import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] result = {0,0,0};
        
        int[] arr = {1,2,3,4,5};
        int[] brr = {2,1,2,3,2,4,2,5};
        int[] crr = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++) {
            int at = i%5;
            if(arr[at] == answers[i]) {
                result[0] += 1;
            }
        }
        
        for(int i=0; i<answers.length; i++) {
            int bt = i%8;
            if(brr[bt] == answers[i]) {
                result[1] += 1;
            }
        }
        
        for(int i=0; i<answers.length; i++) {
            int ct = i%10;
            if(crr[ct] == answers[i]) {
                result[2] += 1;
            }
        }
        
        int max = Math.max(result[0], Math.max(result[1], result[2]));
        
        List<Integer> list = new ArrayList<>();
        
        if(result[0] == max) {
            list.add(1);
        }
        if(result[1] == max) {
            list.add(2);
        }
        if(result[2] == max) {
            list.add(3);
        }
        
        Collections.sort(list);
        int[] results = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            results[i] = list.get(i);
        }
        
        return results;
    }
}