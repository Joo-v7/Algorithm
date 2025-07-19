import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String u = s.toUpperCase();
        String l = s.toLowerCase();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == u.charAt(i)) {
                answer.append(l.charAt(i));
            } else if(s.charAt(i) == l.charAt(i)) {
                answer.append(u.charAt(i));
            }
        }

        System.out.println(answer);
    }
}
