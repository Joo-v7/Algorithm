import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(br.readLine());

       StringBuilder sb = new StringBuilder();

       int[] arr = new int[n];

       for (int i=0; i<n; i++) {
           arr[i] = Integer.parseInt(br.readLine());
       }

       // 산술 평균
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        long avg = Math.round((double)sum/n);

        sb.append(avg).append("\n");

        // 중앙값
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        int target = arrCopy.length/2;

        sb.append(arrCopy[target]).append("\n");

        // 최빈값
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int value = arr[i];
            if(!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }
        }

        int frequency = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > frequency) {
                frequency = entry.getValue();
            }
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == frequency) {
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        if(list.size() > 1) {
            sb.append(list.get(1)).append("\n");
        } else {
            sb.append(list.get(0)).append("\n");
        }

        // 범위
        int scope = Math.abs(arrCopy[arrCopy.length-1] - arrCopy[0]);
        sb.append(scope).append("\n");

        System.out.println(sb);



    }

}
