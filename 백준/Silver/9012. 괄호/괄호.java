import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, String> map = new HashMap<>();

        map.put(")", "(");

        for(int i = 0; i < n; i++) {
            String input = sc.nextLine();
            char[] chars = input.toCharArray();
            Stack<String> stack = new Stack<>();
            boolean flag = true;
            for(int j = 0; j < input.length(); j++) {
                String temp = String.valueOf(chars[j]);
                if(temp.equals("(")) {
                    stack.push(temp);
                } else if(temp.equals(")")) {
                    if(!stack.isEmpty()) {
                        String pop = stack.pop();
                        if(!map.get(temp).equals(pop)) {
                            flag = false;
                            break;
                        }
                    } else {
                        flag = false;
                        break;
                    }

                }
            }
            if(flag && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }


    }
}
