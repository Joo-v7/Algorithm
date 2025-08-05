import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[15][15];

        // 0층
        for(int i=0; i<15; i++) {
            matrix[0][i] = i+1;
        }

        for(int i=1; i<15; i++) {
            for(int j=0; j<15; j++) {
                int sum = 0;
                for(int k=0; k<=j; k++) {
                    sum += matrix[i-1][k];
                }

                matrix[i][j] = sum;
            }
        }

        int t = sc.nextInt();

        for(int i=0; i<t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(matrix[k][n-1]);
        }



    }


}
