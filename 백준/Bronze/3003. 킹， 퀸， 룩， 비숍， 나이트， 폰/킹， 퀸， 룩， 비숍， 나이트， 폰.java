import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};

        for (int i = 0; i<6; i++) {
            int input = sc.nextInt();
            System.out.print(arr[i] - input);
            System.out.print(" ");
        }
        sc.close();
    }
}