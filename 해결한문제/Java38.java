package pracitce;

import java.util.Scanner;

public class Java38 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double c = (double)(a*b / 2 );
		
		System.out.printf("%.1f", c);
	}

}
