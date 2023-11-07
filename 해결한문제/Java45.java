package practice;

import java.util.Scanner;

public class  Java100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double geun = Math.pow(b,2)-4*a*c;
        double result;
        if(geun==0){
            result =(-b)/(2*a);
            System.out.printf("%.2f",result);
        }
        else if(geun<0){
            System.out.println("실근이 없습니다.");
        }
        else{
            double result1 = (-b-Math.sqrt(geun))/2*a;
            double result2 = (-b+Math.sqrt(geun))/2*a;
            System.out.printf("방정식의 해는 %.2f\n",result2);
            System.out.printf("방정식의 해는 %.2f",result1);
        }
    }
}
