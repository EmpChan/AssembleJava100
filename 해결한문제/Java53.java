package practice;

import java.util.Scanner;

public class Java100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int minus = Math.max(a - b, a + b);
        int plus = a + b;
        int mul = a * b;
        int dis = Math.max(a / b, b / a);
        int pow_ = Math.max((int) Math.pow((double) a, (double) b), (int) Math.pow((double) b, (double) a));
        System.out.printf("%f", (double) Math.max(minus, Math.max(plus, Math.max(mul, Math.max(dis, pow_)))));
    }
}
