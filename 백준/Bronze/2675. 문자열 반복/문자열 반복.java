import java.util.*;

public class Main {

  public static void print(char[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i]);
      }
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      String s = sc.next();

      char[] arr = s.toCharArray();
      print(arr, m);
    }

    sc.close();

  }
}