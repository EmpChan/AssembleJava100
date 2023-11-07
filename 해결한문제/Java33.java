package practice;


import java.util.Scanner;

public class  Java100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        month%=12;
        if(month>=0&&month<=2){
            System.out.println("winter");
        }
        else if(month>=3&&month<=5){
            System.out.println("spring");
        }
        else if(month>=6&&month<=8){
            System.out.println("summer");
        }
        else{
            System.out.println("fall");
        }
    }
}
