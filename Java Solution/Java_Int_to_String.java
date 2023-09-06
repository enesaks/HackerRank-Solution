import java.util.Scanner;

public class Java_Int_to_String {
    /*
    Problem
    https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true
     */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s =Integer.toString(a);

        try{
            if(a <= 100 && a >= -100){
                System.out.println("Good job");
            }
        }catch(Exception e){
            System.out.println("Wrong Answer");
        }



    }

}
