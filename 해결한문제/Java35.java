package practice;


import java.util.Scanner;

public class  Java100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for(int i=2;i<=n;i+=2){
            sum+= i;
        }
        System.out.println(sum);
    }
}
