package java_ex100;

import java.util.Scanner;

public class Java92 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array;
		array=new int[10];
		for(int i=0;i<10;i++)
			array[i]=sc.nextInt();
		try{
			Thread.sleep(5000);
		}catch(Exception e) {}
		for(int i=0;i<20;i++)System.out.println();
		int k=sc.nextInt();
		System.out.println(k+"번째숫자는?");
		System.out.println(array[k-1]);

	}
}