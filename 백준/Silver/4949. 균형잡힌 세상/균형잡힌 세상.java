import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        map.put(")", "(");
        map.put("]", "[");

        while(sc.hasNext()) {
            Stack<String> stack = new Stack<>();
            boolean ok = true;
            String input = sc.nextLine();
            if (input.equals(".")) return;

            char[] chars = input.toCharArray();
            for(int i = 0; i < input.length(); i++) {
                String temp = String.valueOf(chars[i]);
                if (temp.equals("(") || temp.equals("[")) {
                    stack.push(temp);
                } else if (temp.equals(")") || temp.equals("]")) {
                    if(!stack.isEmpty()) {
                        String pop = stack.pop();
                        if (!map.get(temp).equals(pop)) {
                            ok = false;
                            break;
                        }
                    } else {
                        ok = false;
                        break;
                    }

                }
            }

            if(ok && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
