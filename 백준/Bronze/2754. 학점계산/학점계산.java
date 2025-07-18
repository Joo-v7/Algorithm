import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] scores = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        HashMap<String, Double> hashMap = new HashMap<>();
        for(int i = 0; i < 13; i++) {
            hashMap.put(words[i], scores[i]);
        }

        System.out.println(hashMap.get(input));
    }
}
