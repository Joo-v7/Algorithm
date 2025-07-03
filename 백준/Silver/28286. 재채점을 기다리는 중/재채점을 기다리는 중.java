import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int k;
    static int[] answer;
    static int[] submit;
    static int maxScore = 0;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        answer = new int[n];
        submit = new int[n];

        for(int i=0; i<n; i++) {
            answer[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            submit[i] = sc.nextInt();
        }

        dfs(0, submit);
        System.out.println(maxScore);

    }

    static void dfs(int depth, int[] current) {
        maxScore = Math.max(maxScore, score(current));
        if(depth == k) {
            return;
        }

        for(int p=0; p<n; p++) {
            int[] copy1 = Arrays.copyOf(current, n);
            shiftRight(copy1, p);
            dfs(depth + 1, copy1);
        }

        for(int p=0; p<n; p++) {
            int[] copy2 = Arrays.copyOf(current, n);
            shiftLeft(copy2, p);
            dfs(depth + 1, copy2);
        }
    }

    static void shiftRight(int[] copy, int p) {
        for(int i=n-1; i>p; i--) {
            copy[i] = copy[i-1];
        }
        copy[p] = 0;
    }

    static void shiftLeft(int[] copy, int p) {
        for(int i=p+1; i<n; i++) {
            copy[i-1] = copy[i];
        }
        copy[n-1]=0;
    }

    static int score(int[] current) {
        int count = 0;
        for(int i=0; i<n; i++) {
            if(answer[i] == current[i]) {
                count++;
            }
        }

        return count;
    }
}
