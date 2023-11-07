package pracitce;

import java.util.Scanner;

public class Java98 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int [][] array = new int[10][10];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print("X:");
			int a = scanner.nextInt();
			System.out.print("Y:");
			int b = scanner.nextInt();
			array[--a][--b] = 1;
		}
		
		for(int i = 0; i< 10 ; i++) {
			for(int j = 0; j < 10 ; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
