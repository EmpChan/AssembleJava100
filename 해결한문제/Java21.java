package practice;

import java.util.Scanner;

public class Java21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = a*(int)Math.pow(2, b);

        System.out.println(k);
    }
}
