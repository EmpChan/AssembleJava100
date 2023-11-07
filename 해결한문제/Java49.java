package practice;

import java.util.Scanner;

public class Java100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int sum = 0;
        sum += hour * 60;
        sum += minute;
        sum -= 30;
        System.out.printf("%d %d", sum / 60, sum % 60);
    }
}
