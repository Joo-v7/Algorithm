import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.countTokens() > 1) {
                String s = st.nextToken();
                int x = Integer.parseInt(st.nextToken());


                switch (s) {
                    case "add": {
                        set.add(x);
                    }
                    break;

                    case "remove": {
                        set.remove(x);
                    }
                    break;

                    case "check": {
                        if (set.contains(x)) {
                            sb.append("1").append("\n");
                        } else {
                            sb.append("0").append("\n");
                        }
                    }
                    break;

                    case "toggle": {
                        if (set.contains(x)) {
                            set.remove(x);
                        } else {
                            set.add(x);
                        }
                    }
                    break;

                }
            } else {
                String s = st.nextToken();

                switch (s) {
                    case "all": {
                        set.clear();
                        for (int j = 1; j <= 20; j++) {
                            set.add(j);
                        }
                    }
                    break;

                    case "empty": {
                        set.clear();
                    }
                    break;
                }
            }

        }

        System.out.println(sb);

    }

}
