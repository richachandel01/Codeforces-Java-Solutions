
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> programmers = new ArrayList<>();
        List<Integer> mathematicians = new ArrayList<>();
        List<Integer> sportsmen = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int skill = sc.nextInt();

            if (skill == 1) {
                programmers.add(i);
            } else if (skill == 2) {
                mathematicians.add(i);
            } else {
                sportsmen.add(i);
            }
        }

        int teams = Math.min(
            programmers.size(),
            Math.min(mathematicians.size(), sportsmen.size())
        );

        System.out.println(teams);

        for (int i = 0; i < teams; i++) {
            System.out.println(
                programmers.get(i) + " " +
                mathematicians.get(i) + " " +
                sportsmen.get(i)
            );
        }

        sc.close();
    }
}
