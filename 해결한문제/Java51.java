package practice;

import java.util.Scanner;

public class Java100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = n % 10;
        int ten = n / 10;
        int sum = 0;
        sum = ((ten + one * 10) * 2) % 100;
        System.out.println(sum);
        if (sum <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }
    }
}
