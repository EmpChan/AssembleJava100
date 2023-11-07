package java_ex100;

import java.util.Scanner;

public class Java32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch (ch) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
			
		default:
			System.out.println("what?");
			break;

		}
		
		
	}

}
