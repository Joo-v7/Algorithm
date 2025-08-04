import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char[] input = sc.nextLine().toCharArray();

            // 0이면 종료.
            if(input.length == 1 && input[0] == '0'){
                return;
            }

            boolean result = true;

            for(int i=0; i<input.length/2; i++){
                char temp = input[input.length-1-i];
                if(input[i] != temp) {
                    result = false;
                    break;
                }
            }

            if(result){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }


    }

}
