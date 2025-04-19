import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = 0;

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    Set<String> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      set.add(br.readLine());
    }

    for (int i = 0; i < m; i++) {
      String num = br.readLine();
      if (set.contains(num)) {
        count++;
      }
    }

    System.out.println(count);

  }
}