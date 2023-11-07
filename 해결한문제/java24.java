package practice;

import java.util.Scanner;

public class Java24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b>=a) {
        	System.out.println("1");
        }else {
        	System.out.println("0");
        }
        sc.close();
    }
}
