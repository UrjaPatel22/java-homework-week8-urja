package homeworkweek8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Program8 obj = new Program8();
        obj.rightangleTriangle();


    }

    public void rightangleTriangle() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
