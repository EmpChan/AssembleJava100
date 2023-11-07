package java_ex100;

import java.util.Scanner;

public class Java62 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int grade=sc.nextInt()*100000;
		int _class=sc.nextInt()*1000;
		int number=sc.nextInt()*1;
		int person_num=grade+_class+number;
		System.out.print(person_num);
	}

}
