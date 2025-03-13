import java.util.*;

public class Main {

  public static int reverse(char[] arr) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[arr.length - 1 - i]);
    }

    return Integer.parseInt(sb.toString());
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();

    char[] arr1 = s1.toCharArray();
    char[] arr2 = s2.toCharArray();

    int n = reverse(arr1);
    int m = reverse(arr2);

    if (n > m) {
      System.out.println(n);
    } else {
      System.out.println(m);
    }

  }
}