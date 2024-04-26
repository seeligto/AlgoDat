package Sheet2;
import java.util.Scanner;

public class BruchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For which N should it get tested?:");
        long n = input.nextLong();
        Bruch bruch = new Bruch(1, 1);
        for (int i = 1; i < n; i++) {
            Bruch b = new Bruch(1, i);
            bruch.add(b);
            System.out.println(STR."Iteration \{i}: \{bruch.get()} - \{(double) bruch.getNumerator() / bruch.getDenominator()}");
        }
        System.out.println("Give me N to approximate e:");
        n = input.nextLong();
        bruch = new Bruch(1, 1);
        Bruch tmp = bruch.e(n);
        System.out.println(STR."Approximatly: \{tmp.get()} - \{(double) tmp.getNumerator() /  tmp.getDenominator()}");

        // Test against exact e-value
        System.out.println(STR."Exact e-value: \{Math.E}");
        System.out.println(STR."Difference in %: \{(Math.abs((Math.E - (double) tmp.getNumerator() /  tmp.getDenominator()) / Math.E) * 100)} %");
    }
}
