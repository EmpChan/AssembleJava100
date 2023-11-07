package java_ex100;

import java.util.Scanner;

public class Java60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
		if(a<=170)System.out.println("CRASH "+a);
		else if(b<=170)System.out.println("CRASH "+b);
		else if(c<=170)System.out.println("CRASH "+c);
		else System.out.println("PASS");
	}
}