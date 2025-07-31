import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 1;
        int num = 1;
        int rate = 6;

        while(n > num) {
            num += rate*count;
            count++;
        }

        System.out.println(count);
    }

}
