import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            for(int i=0; i<k-1; i++) {
                queue.add(queue.poll());
            }
            if(queue.size() == 1) {
                sb.append(queue.poll());
            } else {
                sb.append(queue.poll()+", ");
            }

        }

        System.out.println(sb+">");

    }

}
