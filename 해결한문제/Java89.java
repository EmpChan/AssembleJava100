import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            if(i < 7 && n-i < 7) { 
                System.out.print(i);
                System.out.print(" ");
                System.out.print(n-i);
                System.out.println();
            }
        }
    }
}
