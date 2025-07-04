import java.util.*;
import java.io.*;

public class Main {

    static int n;
    static int[] arr;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        nQueen(0);

        System.out.println(count);
    }

    static void nQueen(int depth) {
        if(depth == n) {
            count++;
            return;
        }

        for(int i = 0; i < n; i++) {
            arr[depth] = i;
            if(possible(depth)) {
                nQueen(depth + 1);
            }
        }
    }

    static boolean possible(int col) {
        for (int i=0; i<col; i++) {
            if(arr[col] == arr[i]) {
                return false;
            }

            else if(Math.abs(col-i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
