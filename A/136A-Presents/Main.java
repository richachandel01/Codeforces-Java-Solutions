
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];

        for (int i = 1; i <= n; i++) {
            p[i - 1] = sc.nextInt();
        }

        int[] giver = new int[n];

        for (int i = 1; i <= n; i++) {
            int receiver = p[i - 1];
            giver[receiver - 1] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(giver[i] + " ");
        }

        sc.close();
    }
}
