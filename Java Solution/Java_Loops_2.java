import java.util.Scanner;

public class Java_Loops_2 {
    /*
    Problem
    https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
     */

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int temp =0;

        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int d = 2;
            temp = a +(1*b);
            System.out.print(temp+" ");

            for(int j =2; j<=n; j++){

                temp = temp + (d*b);
                System.out.print(temp+" ");
                d *= 2;

            }
            System.out.println();
            temp = 0;

        }

        in.close();
    }
}
