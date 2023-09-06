import java.util.Scanner;

public class Java_End_of_file {
    /*
    Problem
    https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;

        do {
            String s = scanner.nextLine();
            System.out.println(i+" "+s);

            i++;
        } while (scanner.hasNext());

    }
}
