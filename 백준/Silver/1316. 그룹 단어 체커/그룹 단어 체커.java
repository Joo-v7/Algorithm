import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (check(word)) {
                count += 1;
            }
        }

        System.out.println(count);
    }

    private static boolean check(String word) {
        char[] chars = word.toCharArray();
        boolean[] checked = new boolean[26];
        char prev = 0;

        for(char c : chars) {
            if(c != prev) {
                if(checked[c - 'a']) {
                    return false;
                }
                checked[c - 'a'] = true;
            }
            prev = c;
        }

        return true;
    }
}