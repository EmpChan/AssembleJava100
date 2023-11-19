
import java.util.Scanner;

public class Java46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int carHeight = 170;
		int tunnelCount = 3;
		int tunnelHeight[] = new int[tunnelCount];
		
		for(int i = 0; i < tunnelCount; i++) {
			    tunnelHeight[i] = scan.nextInt();
		}
			for(int i = 0; i < tunnelCount; i++) {
			    if (tunnelHeight[i] <= carHeight) {
				System.out.println("CRASH");
			} else {
				System.out.println("PASS");
			} 
		}
		scan.close();
	}
}
