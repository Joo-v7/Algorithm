import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int number;
        if(isNumber(a)) {
            number = Integer.parseInt(a);
            fizzBuzz(number, 3);
        } else if(isNumber(b)) {
            number = Integer.parseInt(b);
            fizzBuzz(number, 2);
        } else if(isNumber(c)) {
            number = Integer.parseInt(c);
            fizzBuzz(number, 1);
        }

    }

    public static void fizzBuzz(int number, int count) {
        int n = number+count;

        if(n%3 == 0 && n%5 == 0) {
            System.out.println("FizzBuzz");
        } else if(n%5 != 0 && n%3 == 0) {
            System.out.println("Fizz");
        } else if(n%5 == 0 && n%3 != 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number + count);
        }
    }

    public static boolean isNumber(String s) {
        if(s == null && s.isEmpty()){
            return false;
        }

        for(char c : s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }

        return true;
    }

}
