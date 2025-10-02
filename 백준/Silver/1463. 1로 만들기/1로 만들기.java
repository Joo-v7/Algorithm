import java.io.*;
import java.util.*;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];

        dp[0] = dp[1] = 0;

        System.out.println(recursion(n));

    }

    static int recursion(int n) {
        if(dp[n] == null) {

            if(n % 6 == 0) {
                dp[n] = Math.min(Math.min(recursion(n/2), recursion(n/3)), recursion(n-1)) + 1;
            }

            else if(n % 3 == 0) {
                dp[n] = Math.min(recursion(n/3), recursion(n - 1)) + 1;
            }

            else if(n % 2 == 0) {
                dp[n] = Math.min(recursion(n/2), recursion(n-1)) + 1;
            }

            else {
                dp[n] = recursion(n-1) + 1;
            }
        }

        return dp[n];
    }

}

