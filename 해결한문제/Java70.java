package pracitce;

import java.util.Scanner;

public class Java70 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		
		for(int b = 1 ; b < n ; b++) {
			a *= r;
		}
		System.out.println(a);
	}

}
