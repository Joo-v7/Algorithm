import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min=0;
        int max=0;

        int n = sc.nextInt();

        min = max = sc.nextInt();

        for(int i=0; i<n-1; i++) {
            int k = sc.nextInt();
            if(k<min) min = k;
            if(k>max) max = k;
        }

        System.out.println(min+" "+max);
    }
}