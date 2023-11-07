package pracitce;

import java.util.Scanner;

public class Java88 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int sn = 0;
		
		while(n > 0) {
			for(int i = 1; i<=n ; i++) {
				sn+=i;
			}
			n--;
		}
		
		System.out.println(sn);
	}

}
