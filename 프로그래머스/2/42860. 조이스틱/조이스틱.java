import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;

        // 총 알파벳 변경 조작 횟수
        for(int i=0; i<name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }

        // 커서 이동 최솟값
        int move = name.length() - 1; // 기본적으로 오른쪽으로 쭉 간다고 가정
        
        for(int i=0; i<name.length(); i++) {
            
            int next = i+1;
            while(next < name.length() && name.charAt(next) == 'A') {
                next++;
            }

            move = Math.min(move, (i*2) + name.length() - next);
            move = Math.min(move, i+(name.length()-next)*2);
        }

        return answer + move;
    }
    
}