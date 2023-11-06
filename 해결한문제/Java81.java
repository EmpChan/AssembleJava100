import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        int max= -9999999;
        int min= 99999999;
        for (int i = 0; i < a.length; i++) {
            a[i]=scan.nextInt();
            if(max < a[i])max = a[i];
            if(min > a[i])min = a[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
