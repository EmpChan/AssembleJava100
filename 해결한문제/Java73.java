package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int arr[] = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50, 6, 60, 7, 70, 8, 80, 9, 90, 10, 100, 11, 110, 12, 120};
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println(arr[a-1]+arr[b-1]);
    }
}
