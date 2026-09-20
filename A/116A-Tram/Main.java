import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int currentPassengers = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            currentPassengers = currentPassengers - a + b;

            maxCapacity = Math.max(maxCapacity, currentPassengers);
        }

        System.out.println(maxCapacity);

        sc.close();
    }
}