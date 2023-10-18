package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i=1; i<=a; i++){
            Boolean flag = false;
            String n = Integer.toString(i);
            for(int j=0; j<n.length(); j++){
                if(n.charAt(j)=='3' || n.charAt(j) == '6' || n.charAt(j) == '9'){
                    flag = true;
                }
            }
            if(flag==false){
                System.out.print(n+' ');
            }
            else{
                System.out.print("X ");
            }
        }
    }
}
