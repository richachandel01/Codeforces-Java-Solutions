import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] before = new int[n];
        int[] after = new int[n];

        boolean ratingChanged = false;

        for (int i = 0; i < n; i++) {
            before[i] = sc.nextInt();
            after[i] = sc.nextInt();

            if (before[i] != after[i]) {
                ratingChanged = true;
            }
        }

        // If anyone's rating changed, the round was rated.
        if (ratingChanged) {
            System.out.println("rated");
            sc.close();
            return;
        }

        // Check whether ratings are in non-increasing order.
        for (int i = 1; i < n; i++) {
            if (before[i] > before[i - 1]) {
                System.out.println("unrated");
                sc.close();
                return;
            }
        }

        // No rating changed and order is valid.
        System.out.println("maybe");

        sc.close();
    }
}