package practice;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int lotto[] = new int[7];
        int cnt = 0;
        Boolean bonus = false;
        for(int i=0; i<7; i++){
            lotto[i] = scan.nextInt();
        }
        for(int i=0; i<6; i++){
            int k = scan.nextInt();
            if(k==lotto[i]){
                cnt++;
            }
            if(lotto[6]==k){
                bonus = true;
            }
        }

        if(cnt == 6){
            System.out.println(1);
        }
        else if(cnt == 5 && bonus){
            System.out.println(2);
        }
        else if(cnt == 5){
            System.out.println(3);
        }
        else if(cnt == 4){
            System.out.println(4);
        }
        else if(cnt == 3){
            System.out.println(5);
        }
        else{
            System.out.println(0);
        }
    }
}
