package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int s = 0;
        for(int i=0; i<2; i++){
            int a = scan.nextInt();
            if(a==1){
                s+=400;
            }
            else if(a==2){
                s+=340;
            }
            else if(a==3){
                s+=170;
            }
            else if(a==4){
                s+=100;
            }
            else{
                s+=70;
            }
        }
        if(s>500){
            System.out.println("angry");
        }
        else{
            System.out.println("no angry");
        }
    }
}
