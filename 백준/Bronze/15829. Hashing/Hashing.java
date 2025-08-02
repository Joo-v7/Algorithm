import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<26; i++) {
            map.put(chars[i], i+1);
        }

        String s = sc.nextLine();
        char[] charArray = s.toCharArray();

        int result = 0;
        for(int i=0; i<n; i++) {
            result += map.get(charArray[i]) * r(i+1);
        }

        System.out.println(result);

    }

    // num * 31의 num승
    public static int r(int count) {
        int r = 1;

        for(int i=0; i<count-1; i++) {
            r = r*31;
        }

        return r;
    }

}
