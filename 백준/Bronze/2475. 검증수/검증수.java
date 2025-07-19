import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
            sum += nums[i] * nums[i];
        }

        System.out.println(sum%10);
    }
}
