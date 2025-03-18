import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    char[] strArr = input.toCharArray();
    int count = 0;

    for (int i = 0; i < strArr.length; i++) {

      if (strArr[i] == 'c' && i < strArr.length - 1) {
        if (strArr[i + 1] == '=' || strArr[i + 1] == '-') {
          i = i + 1;
        }
      } else if (strArr[i] == 'd' && i < strArr.length - 1) {
        if (strArr[i + 1] == '-') {
          i = i + 1;
        } else if (strArr[i + 1] == 'z' && i < strArr.length - 2) {
          if (strArr[i + 2] == '=') {
            i = i + 2;
          }
        }
      } else if (strArr[i] == 'l' && i < strArr.length - 1) {
        if (strArr[i + 1] == 'j') {
          i = i + 1;
        }
      } else if (strArr[i] == 'n' && i < strArr.length - 1) {
        if (strArr[i + 1] == 'j') {
          i = i + 1;
        }
      } else if (strArr[i] == 's' && i < strArr.length - 1) {
        if (strArr[i + 1] == '=') {
          i = i + 1;
        }
      } else if (strArr[i] == 'z' && i < strArr.length - 1) {
        if (strArr[i + 1] == '=') {
          i = i + 1;
        }
      }

      count++;

    }

    System.out.println(count);
  }
}