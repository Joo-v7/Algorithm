import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int result = 0;
        if(k<0 || k>n) {
            System.out.println(0);
        } else {
            result = factorial(n)/(factorial(k)*factorial(n-k));
            System.out.println(result);
        }
    }

    static int factorial(int n) {
        if(n<=1) {
            return 1;
        }
          return n*factorial(n-1);
    }
}
