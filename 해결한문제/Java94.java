package practice;

import java.util.Scanner;

public class Java94 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=0,b=0;
		String c = scan.nextLine();
		for (int i = 0; i < c.length(); i++){
			if(c.charAt(i) == '('){
				a++;
			}
			else if(c.charAt(i) == ')'){
				b++;
			}
		}
		System.out.println(a +" "+ b);
        scan.close();
    }
}
