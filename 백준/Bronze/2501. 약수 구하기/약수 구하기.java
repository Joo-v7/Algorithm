import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        if (list.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}