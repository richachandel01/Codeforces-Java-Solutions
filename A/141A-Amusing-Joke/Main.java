import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] frequency = new int[26];

        // Count letters from guest name
        for (int i = 0; i < guest.length(); i++) {
            frequency[guest.charAt(i) - 'A']++;
        }

        // Count letters from host name
        for (int i = 0; i < host.length(); i++) {
            frequency[host.charAt(i) - 'A']++;
        }

        // Remove letters from pile
        for (int i = 0; i < pile.length(); i++) {
            frequency[pile.charAt(i) - 'A']--;
        }

        // Check if every frequency is zero
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) {
                System.out.println("NO");
                sc.close();
                return;
            }
        }

        System.out.println("YES");

        sc.close();
    }
}