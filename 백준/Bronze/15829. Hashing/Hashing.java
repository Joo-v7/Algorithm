import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        Character[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(chars[i], i + 1);
        }

        String s = sc.nextLine();
        char[] charArray = s.toCharArray();

        BigInteger result = BigInteger.ZERO;
        BigInteger mod = new BigInteger("1234567891");

        for (int i = 0; i < n; i++) {
            BigInteger value = BigInteger.valueOf(map.get(charArray[i]));
            result = result.add(value.multiply(r(i + 1)));
        }

        result = result.mod(mod);

        System.out.println(result);
    }

    // BigInteger 버전의 r 함수: 31^(count - 1)
    public static BigInteger r(int count) {
        return BigInteger.valueOf(31).pow(count - 1);
    }
}
