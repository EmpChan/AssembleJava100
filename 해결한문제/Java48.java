package pracitce;

import java.util.Scanner;

public class Java48 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int frontid = scanner.nextInt();
		int sex = scanner.nextInt();
		int year = (int)(frontid / 10000);
		
		if(sex == 1 || sex == 2) {
			System.out.println(2012-(1900+year)+1);
		}else {
			System.out.println(2012-(2000+year)+1);
		}
		
		System.out.println();
	}

}
