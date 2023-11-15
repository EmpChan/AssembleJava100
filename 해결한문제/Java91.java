import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = i; j < b.length; j++) {
                System.out.print(b[j]+ " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(b[j] + " ");
            }
            System.out.println();
        }
    }
}
