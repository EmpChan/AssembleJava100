
import java.util.Scanner;

public class Java56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int states[] = new int[4];
		
		for (int i = 0; i < 4; i++) {
			states[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int state : states) {
			if(state == 1){
				count++;
			}
		}
		
		String result;
		switch (count) {
		case 0:
			result = "모";
			break;
		case 1:
			result = "도";
			break;
		case 2:
			result = "개";
			break;
		case 3:
			result = "걸";
			break;
		default:
			result = "윷";
			break;
		}
		
		System.out.println(result);
		
		scan.close();
	}
}