import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p = sc.nextLine();

        boolean producesOutput = false;

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);

            if (ch == 'H' || ch == 'Q' || ch == '9') {
                producesOutput = true;
                break;
            }
        }

        if (producesOutput) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}