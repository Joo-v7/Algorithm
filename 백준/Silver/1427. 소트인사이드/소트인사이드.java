import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int[] numbers = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            numbers[i] = chars[i] - '0';
        }

        Arrays.sort(numbers);

        for(int i=numbers.length-1; i>=0; i--) {
            System.out.print(numbers[i]);
        }

    }
}
