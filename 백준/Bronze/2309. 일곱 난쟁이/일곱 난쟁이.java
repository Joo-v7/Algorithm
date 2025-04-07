import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int temp = sum - arr[i] - arr[j];
                if(temp == 100) {
                    for(int k=0; k<arr.length; k++) {
                        if(arr[k] != arr[i] && arr[k] != arr[j]) {
                            list.add(arr[k]);
                        }
                    }
                    Collections.sort(list);
                    for(int n : list) {
                        System.out.println(n);
                    }
                    return;
                }
            }
        }


    }

}