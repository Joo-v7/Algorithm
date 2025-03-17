import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[26];

    String s = br.readLine().toUpperCase();
    char[] stringArr = s.toCharArray();

    for (int i = 0; i < stringArr.length; i++) {
      arr[stringArr[i] - 'A']++;
    }

    int max = 0;
    int result = '?';

    for (int j = 0; j < 26; j++) {
      if (arr[j] > max) {
        max = arr[j];
        result = j + 65;
      } else if (arr[j] == max) {
        result = '?';
      }
    }

    System.out.println((char) result);

  }
}