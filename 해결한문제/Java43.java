package practice;

import java.util.Scanner;

public class  Java100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        for(int i=0;i<len;i++){
            switch(str.charAt(i)){
                case '1' :
                    System.out.print("일");
                    break;
                case '2' :
                    System.out.print("이");
                    break;
                case '3' :
                    System.out.print("삼");
                    break;
                case '4' :
                    System.out.print("사");
                    break;
                case '5' :
                    System.out.print("오");
                    break;
                case '6':
                    System.out.print("육");
                    break;
                case '7':
                    System.out.print("칠");
                    break;
                case '8':
                    System.out.print("팔");
                    break;
                case '9':
                    System.out.print("구");
                    break;
                default: break;
            }
            if(str.charAt(i)=='0') continue;
            switch(len-i){
                case 5 :
                    System.out.print("만");
                    break;
                case 4 :
                    System.out.print("천");
                    break;
                case 3 :
                    System.out.print("백");
                    break;
                case 2 :
                    System.out.print("십");
                    break;
                case 1 :
                    System.out.print("");
                    break;
            }
        }
    }
}
