import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            s[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(s, (a, b) -> (b+a).compareTo(a+b));
        
        if(s[0].equals("0")) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int j=0; j<s.length; j++) {
            answer.append(s[j]);
        }
        
        return answer.toString();
    }
}