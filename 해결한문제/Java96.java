
import java.util.Scanner;

public class Java96 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] name = new String[n];
		int[] score = new int[n];
		
		for (int i = 0; i < n; i++) {
			name[i] = scan.next();
			score[i] = scan.nextInt();
		}
		int thirdScore = findScore(score);
		
		for (int i = 0; i < n; i++) {
				if(score[i] == thirdScore) {
					System.out.println(name[i]);
				}
			}
		
		scan.close();
	}
	
	public static int findScore(int[] scores) {
		int first = 0;
        int second = 0;
        int third = 0;

        for (int score : scores) {
            if (score > first) {
                third = second;
                second = first;
                first = score;
            } else if (score > second && score != first) {
                third = second;
                second = score;
            } else if (score > third && score != second && score != first) {
                third = score;
            }
        }

        return third;
    }
}