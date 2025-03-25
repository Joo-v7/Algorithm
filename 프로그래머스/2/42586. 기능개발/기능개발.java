import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<progresses.length; i++) {
            int remain = 100 - progresses[i];
            int day = (remain + speeds[i] - 1) / speeds[i];
            queue.add(day);
        }

        while(!queue.isEmpty()) {
            int d = queue.poll();
            int count = 1;

            while(!queue.isEmpty()) {
                if(d >= queue.peek()) {
                    queue.poll();
                    count ++;
                }else {
                    break;
                }
            }
            list.add(count);
        }

        return list.stream().mapToInt(i->i).toArray();
        
    }
}