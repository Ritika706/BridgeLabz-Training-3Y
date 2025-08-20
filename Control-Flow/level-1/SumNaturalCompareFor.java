import java.util.Scanner;

public class SumNaturalCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Sum (formula): " + formulaSum);
            System.out.println("Sum (for loop): " + loopSum);
            System.out.println("Are both sums equal? " + (formulaSum == loopSum));
        } else {
            System.out.println("The number is not a natural number.");
        }
        sc.close();
    }
}
