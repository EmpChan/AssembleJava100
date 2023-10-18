package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Boolean flag = false;
        for(int i=2; i<a; i++){
            if(a%i==0){
                flag = true;
            }
        }
        if(flag){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
