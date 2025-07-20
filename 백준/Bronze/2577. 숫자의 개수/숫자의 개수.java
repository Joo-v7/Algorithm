import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] checked = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int sum = n*m*k;

        while(sum != 0) {
            int t = sum%10;
            sum = sum/10;
            checked[t]++;
        }

        for(int i=0; i<checked.length; i++) {
            System.out.println(checked[i]);
        }

    }
}
