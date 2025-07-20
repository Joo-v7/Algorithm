import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        if(arr[0] == 1) {
            int t = 1;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == t) {
                    t++;
                } else {
                    System.out.println("mixed");
                    return;
                }
            }

            System.out.println("ascending");
            return;
        }

        if(arr[0] == 8) {
            int t = 8;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == t) {
                    t--;
                } else {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
            return;
        }

        System.out.println("mixed");
    }
}
