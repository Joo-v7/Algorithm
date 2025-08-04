import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // 최대 공약수
        int a,b;
        if(n>m) {
            a = n;
            b = m;
        } else {
            a = m;
            b = n;
        }

        while(b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        } {
            System.out.println(a);
        }

        // 최소 공배수
        System.out.println(n*m/a);

    }


}
