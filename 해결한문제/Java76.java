
import java.util.Scanner;
public class Java76 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		double result = Math.pow(n,k);
		System.out.println((int)result);
		
		scan.close();
	}
	
	}