package pracitce;

import java.util.Scanner;

public class Java18 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	     System.out.println();
	     String input = scanner.nextLine();
	        
	     if (input.length() == 1) {
	    	 
	         char c = input.charAt(0);
	         int asciiValue = (int) c;
	         System.out.println(asciiValue);
	     } 
	      
	     scanner.close();
	}
}
