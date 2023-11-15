import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[26];
        String s= scan.nextLine();
        for(int i=0; i<26; i++){
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == i+97){
                    arr[i]++;
                }
            }
            System.out.println((char)(i+97)+":"+arr[i]);
        }
    }
}
