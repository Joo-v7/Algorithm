import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String[][] matrix = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            matrix[i][0] = input[0];
            matrix[i][1] = input[1];
        }

        Arrays.sort(matrix, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][0] + " ");
            System.out.println(matrix[i][1]);
        }

    }
}
