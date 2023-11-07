package java_ex100;

import java.util.Scanner;

public class Java72 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2;
		int max=0;
		for(int i=0;i<n;i++) {
			n2=sc.nextInt();
			if(max<n2)
				max=n2;
		}
		System.out.println(max);

	}

}
