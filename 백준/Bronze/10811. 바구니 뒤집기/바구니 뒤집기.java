import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
    }

    for (int i = 0; i < m; i++) {
      int start = scanner.nextInt() - 1;
      int end = scanner.nextInt() - 1;

      while (start < end) {
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    scanner.close();

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}