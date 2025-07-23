import java.util.*;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();

            if(temp < 2) {
                continue;
            } else if(temp == 2) {
                count++;
            } else {
                if(check(temp)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    static boolean check(int n) {
        for(int i=2; i<n; i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
