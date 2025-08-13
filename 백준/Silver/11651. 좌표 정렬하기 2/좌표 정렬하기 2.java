import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[n][2];

        for(int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            matrix[i][0] = Integer.parseInt(input[0]);
            matrix[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(matrix, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int i = 0; i < n; i++) {
            System.out.println(matrix[i][0] + " " + matrix[i][1]);
        }

    }
}
