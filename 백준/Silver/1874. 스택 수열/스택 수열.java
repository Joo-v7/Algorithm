import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       int start = 0;

       Stack<Integer> stack = new Stack<>();
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < n; i++) {
           int value = Integer.parseInt(br.readLine());

           if(value > start) {
               for(int j = start+1; j<=value; j++) {
                   stack.push(j);
                   sb.append("+" + "\n");
               }
               start = value;
           }

           else if(stack.peek() != value) {
               System.out.println("NO");
               return;
           }

           stack.pop();
           sb.append("-" + "\n");
       }

       System.out.println(sb);

    }

}
