import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        Arrays.sort(arr);

        int m = sc.nextInt();
        int[] nums = new int[m];

        for(int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            if(set.contains(nums[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
