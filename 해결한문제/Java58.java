package pracitce;

import java.util.Scanner;

public class Java58 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if(c < a + b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
