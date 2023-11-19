
import java.util.Scanner;

public class Java50 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double bmi = scan.nextDouble();
		
		String result = judge(bmi);
		System.out.println(result);
		
		scan.close();
	}

	public static String judge(double bmi) {
		if (bmi < 18.5) {
			return "저체중";
		}	else if (bmi>=18.5&&bmi<=23) {
			return "정상체중";
		}else {
			return "과체중";
		}
	}
}