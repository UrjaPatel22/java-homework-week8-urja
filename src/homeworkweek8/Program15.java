package homeworkweek8;

/**
 * 15. Display Right angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        //int rows = 4;
        System.out.println("Enter Row Number");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int j=1;j <= rows;j++){
            for(int i=1;i <= rows-j;i++){
                System.out.print("  ");
            }

            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
