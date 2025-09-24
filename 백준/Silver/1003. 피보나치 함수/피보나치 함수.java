import java.io.*;
import java.util.*;

public class Main {

    static int zero = 0;
    static int one = 0;
    static int zero_plus_one = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int input = Integer.parseInt(br.readLine());
            fibo(input);

            sb.append(zero + " " + one).append("\n");
        }

        System.out.println(sb);

    }

    static void fibo(int n) {
        zero = 1;
        one = 0;
        zero_plus_one = 1;

        for(int i=0; i<n; i++){
            zero = one;
            one = zero_plus_one;
            zero_plus_one = zero+one;
        }
    }

}

