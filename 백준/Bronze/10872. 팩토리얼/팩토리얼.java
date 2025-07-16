import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;

        answer = factorial(n);

        System.out.println(answer);
    }

    static int factorial(int n) {
        if(n<=1) {
            return 1;
        }

        return n*factorial(n-1);
    }
}
