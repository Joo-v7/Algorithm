import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] arr = new int[n][2];

        int[] answer = new int[n];

        for(int i = 0; i < n; i++) {
            String input = sc.nextLine();
            arr[i][0] = Integer.parseInt(input.split(" ")[0]);
            arr[i][1] = Integer.parseInt(input.split(" ")[1]);
        }

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    count++;
                }
            }
            answer[i] = count+1;
        }

        for(int count : answer) {
            System.out.print(count + " ");
        }

    }
}
