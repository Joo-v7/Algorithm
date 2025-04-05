import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n-- > 0) {
            int k = sc.nextInt();
            int count = 0;

            while (k > 0) {
                if (k % 2 == 1) {
                    System.out.print(count + " ");
                }
                k /= 2;
                count++;
            }

            System.out.println();
        }

    }
}