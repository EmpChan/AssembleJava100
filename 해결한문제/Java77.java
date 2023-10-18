package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int s = 1;
        for(int i=1; i<=a; i++){
            s*=i;
        }
        System.out.println(s);
    }
}
