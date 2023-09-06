import java.util.Scanner;

public class Java_Static_Initializer_Block {
    /*
    Problem
    https://www.hackerrank.com/challenges/java-static-initializer-block?isFullScreen=true
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int b =  scan.nextInt();
        int h = scan.nextInt();
        int area = h * b;

        if(b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(area);
        }


    }

}
