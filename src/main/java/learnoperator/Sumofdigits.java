package learnoperator;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        // 56 = 5 + 6 = 11

        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // int num = 56;
        int sum1 = num % 10;        // remainder (last digit obtained)
        System.out.println(sum1);
        int sum2 = num / 10;        // first digit obtained
        System.out.println(sum2);
        int sum = sum1 + sum2;
        System.out.println("Sum of digits = " + sum);
    }
}
