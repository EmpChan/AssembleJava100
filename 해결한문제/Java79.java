import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c>= 65 && c<=90) 
                result += String.valueOf(c).toLowerCase();
            }
            else if(c>=97 && c<=122) 
                result += String.valueOf(c).toUpperCase();
            }
            else {
                result += c;
            }
        }
        System.out.println(result);
    }
}
