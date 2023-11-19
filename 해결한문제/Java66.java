
import java.util.Scanner;

public class Java66 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		int i,s=0;
		for(i=1; ; i++){
		s+=i;
		if(s >= num) break; 
		}
		System.out.println(s);
		
	}
}
