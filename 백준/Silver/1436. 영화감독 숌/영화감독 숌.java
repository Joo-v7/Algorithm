import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 1;
        int number = 666;

        while(count != n) {
            number++;
            if(String.valueOf(number).contains("666")) {
                count++;
            }
        }

        System.out.println(number);


    }

}
