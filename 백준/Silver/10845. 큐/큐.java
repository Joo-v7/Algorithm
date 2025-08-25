import java.io.*;
import java.util.*;

public class Main {

    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i<n; i++) {
            String input = sc.nextLine();
            String[] tokens = input.split(" ");
            if(tokens.length > 1) {
                check(tokens[0], Integer.parseInt(tokens[1]));
            } else {
                check(tokens[0], 0);
            }
        }

        System.out.println(sb.toString());

    }

    static void check(String s, int num) {
        switch(s) {
            case "push" :
                queue.add(num);
                break;
            case "pop" :
                if(!queue.isEmpty()) {
                    sb.append(queue.poll() + "\n");
                } else {
                    sb.append("-1" + "\n");
                }
                break;
            case "size" :
                sb.append(queue.size()+"\n");
                break;
            case "empty" :
                if(queue.isEmpty()) {
                    sb.append("1" + "\n");
                } else {
                    sb.append("0" + "\n");
                }
                break;
            case "front" :
                if(!queue.isEmpty()) {
                    sb.append(queue.peek() + "\n");
                } else {
                    sb.append("-1" + "\n");
                }
                break;
            case "back" :
                if(!queue.isEmpty()) {
                    Object[] arr = queue.toArray();
                    sb.append(arr[arr.length - 1] + "\n");
                } else {
                    sb.append("-1" + "\n");
                }
                break;
        }

    }


}
