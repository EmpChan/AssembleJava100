package practice;

import java.util.Scanner;

public class Java54{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
    	int c;
        if(a%b==0){
        	c=a/b;
        	System.out.println(b+"*"+c+"="+a);
        }else if(b%a==0){
        	c=b/a;
        	System.out.println(a+"*"+c+"="+b);
        }else{
        	System.out.println("none");
        }
        scan.close();
    }
}
