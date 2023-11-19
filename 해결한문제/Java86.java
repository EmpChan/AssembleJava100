
import java.util.Scanner;

public class Java86 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    Triangle(n);
	    scan.close();
	}
	
	public static void Triangle(int n) {
        for (int i = 1; i <= n; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}