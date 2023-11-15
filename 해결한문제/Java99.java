import java.util.Scanner;

public class Main {
    static void function(int N) {
        if (N >= 90)
            System.out.println("A학점");
        else if (N >= 80)
            System.out.println("B학점");
        else if (N >= 70)
            System.out.println("C학점");
        else if (N >= 60)
            System.out.println("D학점");
        else
            System.out.println("E학점");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        function(score);
    }
}
