import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int i = 1;
        if (number > 0) {
            System.out.print("Factors: ");
            while (i <= number) {
                if (number % i == 0)
                    System.out.print(i + " ");
                i++;
            }
            System.out.println();
        } else {
            System.out.println("The number is not a positive integer.");
        }
        sc.close();
    }
}
