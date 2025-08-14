import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 체스판 받기
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            board[i] = sc.nextLine();
        }

        // 체스판 자르기
        int sol = Integer.MAX_VALUE;
        for(int i = 0; i <= row-8; i++) {
            for(int j = 0; j <= col-8 ; j++) {
                // 체스판의 최소 비용 구하기
                int current = getSolution(i, j, board);
                // 전체 체스판과 비교하며 갱신하기
                if(sol > current) {
                    sol = current;
                }
            }
        }

        System.out.println(sol);
        sc.close();

    }

    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] answer = {"WBWBWBWB", "BWBWBWBW"};
         int whiteSol = 0;
         for(int i = 0; i < 8; i++) {
             int row = startRow + i;
             for(int j = 0; j < 8; j++) {
                 int col = startCol + j;
                 if(board[row].charAt(col) != answer[row%2].charAt(j)) {
                     whiteSol++;
                 }
             }
         }
        return Math.min(whiteSol, 64-whiteSol);
    }
}
