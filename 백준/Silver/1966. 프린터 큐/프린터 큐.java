import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int T = Integer.parseInt(br.readLine());

       StringBuilder sb = new StringBuilder();

       for(int i=0; i<T; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken()); // 개수
           int m = Integer.parseInt(st.nextToken()); // 타겟: 0 ~

           StringTokenizer important = new StringTokenizer(br.readLine()); // 중요도

           LinkedList<int[]> queue = new LinkedList<>();

           for(int j=0; j<n; j++) {
               queue.add(new int[]{j, Integer.parseInt(important.nextToken())});
           }

           int count = 0;

           while(!queue.isEmpty()) {
               int[] temp = queue.poll();
               boolean check = true;

               for(int k=0; k<queue.size(); k++) {

                   if(temp[1] < queue.get(k)[1]) {
                       queue.add(temp);
                       for(int l=0; l<k; l++) {
                           queue.add(queue.poll());
                       }

                       check = false;
                       break;
                   }
               }

               if(!check) {
                   continue;
               }

               count++;
               if(temp[0] == m) {
                   break;
               }
           }

           sb.append(count + "\n");

       }

       System.out.println(sb);


    }

}
