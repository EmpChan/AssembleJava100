package practice;

import java.util.Scanner;

public class Java27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a>b ? a : b);
    }
}
