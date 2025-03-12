import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double m = 0;
        double total = 0;

        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();

            if (m < arr[i]) {
                m = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / m * 100;

            total += arr[i];
        }

        System.out.print(total / n);

    }
}