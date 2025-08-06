import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();

        int m = input[input.length-1] - '0';

        int sum = 0;
        int targetWeight = 0;

        for(int i=0; i<input.length-1; i++) {

            int weight = 1;

            if(i%2 != 0) {
                weight = 3;
            }

            if(input[i] == '*') {
                targetWeight = weight;
                continue;
            }

            sum += weight*(input[i] - '0');
        }

        sum += m;

        int answer = 0;
        while(true) {
            int temp = sum + targetWeight*answer;
            if(temp%10 == 0) {
                break;
            }
            answer++;
        }

        System.out.println(answer);


    }
}
