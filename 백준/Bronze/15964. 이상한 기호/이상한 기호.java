import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long plus = (n+m);
        long minus = (n-m);
        System.out.println(plus * minus);
    }
}
