import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String numbers = s.replace("+", "");

        char[] arr = numbers.toCharArray();

        Arrays.sort(arr);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);

            if (i < arr.length - 1) {
                result.append("+");
            }
        }

        System.out.println(result);

        sc.close();
    }
}