import java.util.Scanner;

public class Java_Stdin_and_Stdout_1 {
    /*
    Problem
    https://www.hackerrank.com/challenges/java-stdin-and-stdout-1?isFullScreen=true
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int myInt = scanner.nextInt();
        int myInt1 = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        scanner.close();


        System.out.println(myInt);
        System.out.println(myInt1);
        System.out.println(myInt2);
    }





}
