import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<=n; i++) {
            String temp = br.readLine();
            map.put(temp, i);
            map2.put(i, temp);
        }

        for(int j=0; j<m; j++) {
            String input = br.readLine();

            if(!isDigit(input)) {
                sb.append(map.get(input)).append("\n");
            } else {
                sb.append(map2.get(Integer.parseInt(input))).append("\n");
            }

        }

        System.out.println(sb);

    }

    static boolean isDigit(String s) {
        boolean result = true;
        for(int i=0; i<s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                result = false;
            }
        }

        return result;
    }

}


