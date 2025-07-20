import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int count = 0;

            for(int j=1; j<=w; j++) {
                for(int k=1; k<=h; k++) {
                    count++;
                    if(count == n) {
                        if(j < 10) {
                            System.out.println(k + "0" +j);
                        } else {
                            System.out.println(k + "" + j);
                        }

                    }
                }
            }

        }

    }
}
