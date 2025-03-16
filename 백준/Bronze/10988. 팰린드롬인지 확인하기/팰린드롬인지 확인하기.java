import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 1;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length / 2 + 1; i++) {
            if (chars[i] != chars[chars.length - i-1]) {
                result = 0;
            }
        }

        System.out.print(result);
    }
}