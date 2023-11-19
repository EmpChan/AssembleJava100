package practice;

import java.util.Scanner;

public class Java80{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++){
			if(b[i] != ' '){
				if(b[i]-3 < 97){
					switch(b[i]-3){
					case 96 : b[i]+=23;
					break;
					case 95 : b[i]+=23;
					break;
					case 94 : b[i]+=23;
					break;
					}
				}else b[i]-=3; 
			}
		}
		for (int i = 0; i < b.length; i++){
			System.out.print(b[i]);
		}
        scan.close();
    }
}
