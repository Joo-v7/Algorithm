import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;

        for(int i=0; i<20; i++) {
            String input = sc.nextLine();
            String[] splits = input.split("\\s+");

            if(!splits[2].equals("P")) {
                double grade = Double.parseDouble(splits[1]);
                sum += grade;
                avg = avg + (grade * replace(splits[2]));
                count++;
            }
        }

        System.out.println(sum == 0 ? 0.0 : avg/sum);
    }

    public static double replace(String s) {
        switch (s) {
            case "A+":
                return 4.5;
            case "A0":
                return 4;
            case "B+":
                return 3.5;
            case "B0":
                return 3;
            case "C+":
                return 2.5;
            case "C0":
                return 2;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0;
        }
        return 0;
    }
}