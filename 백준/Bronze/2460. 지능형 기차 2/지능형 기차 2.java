import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        int now = sc.nextInt();
        int max = now;

        for(int i=0; i<9; i++) {
            int sub = sc.nextInt();
            int add = sc.nextInt();

            now = now - sub + add;

            if(max < now) {
                max = now;
            }
        }

        System.out.println(max);


    }
}