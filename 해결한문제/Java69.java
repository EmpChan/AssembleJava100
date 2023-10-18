package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,d,n;
        a = scan.nextInt();
        d = scan.nextInt();
        n = scan.nextInt();
        System.out.println(a+d*(n-1));
    }
}
