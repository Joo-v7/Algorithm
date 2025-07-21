import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tCount = 0;

        long n = sc.nextInt();
        long[] arr= new long[6];

        for(int i=0; i<6; i++) {
            arr[i] = sc.nextInt();
        }

        long t = sc.nextInt();
        long p = sc.nextInt();

        for(int i=0; i<arr.length; i++) {
            if((arr[i] - t < 0) && arr[i] != 0) {
                tCount++;
            } else if(arr[i] > 0) {
                long temp = arr[i];
                while(temp-t > 0) {
                    tCount++;
                    temp = temp-t;
                }
                if(temp > 0) {
                    tCount++;
                }
            }

        }

        System.out.println(tCount);
        System.out.println(n/p + " " + n%p);


    }
}
