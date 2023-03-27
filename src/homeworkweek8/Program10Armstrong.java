package homeworkweek8;
/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 *
 */

import java.util.Scanner;

public class Program10Armstrong {

    public static void main(String []args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int cube=0,remainder,check;
        int n=input.nextInt();
        check=n;
        int original=n;
        while(n>0)
        {
            remainder=n%10;
            n=n/10;
            cube=cube+(remainder*remainder*remainder);
        }
        if(check==cube)
            System.out.println(original+" Is Armstrong number");
        else
            System.out.println(original+" Is Not Armstrong number");
    }
}


