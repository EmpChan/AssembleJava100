package java_ex100;

import java.util.Scanner;

public class Java82 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			for(int j=1;j<10;j++)
				System.out.println(i+"*"+j+"="+i*j);
		}
	}
}