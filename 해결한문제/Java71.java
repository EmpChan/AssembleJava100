package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,s=0;
        n = scan.nextInt();
        for(int i=0; i<n; i++){
            int t = scan.nextInt();
            s+=t;
        }
        System.out.println(s);
    }
}
