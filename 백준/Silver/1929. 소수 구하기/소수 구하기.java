import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = n; i <= m; i++) {
            isPrimeNumber(i);
        }

        System.out.println(sb.toString());

    }

    public static void isPrimeNumber(int num) {
        if(num < 2) {
            return;
        }

        double sqrt = Math.sqrt(num);

        boolean isPrime = true;
        for(int i = 2; i <= sqrt; i++) {
            if(num % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            sb.append(num + "\n");
        }


    }

}
