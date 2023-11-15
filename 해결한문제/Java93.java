import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; i++)
            words[i] = scan.nextLine();

        for (int i = 0; i < 7; i++)
            System.out.println(i + "번째 단어: " + words[i]);
        try {
            Thread.sleep(5000);
            for (int j = 0; j < 20; j++)
                System.out.println();
        } catch (Exception e) {
            return;
        }

        int k = scan.nextInt();
        System.out.println(k + "번째 단어: " + words[k]);
    }
}
