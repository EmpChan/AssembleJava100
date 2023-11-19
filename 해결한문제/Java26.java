

import java.util.Scanner;

public class Java26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean a = scan.nextBoolean();
		
		boolean b = !a;
		System.out.println(b);
		
		scan.close();
	}

}
