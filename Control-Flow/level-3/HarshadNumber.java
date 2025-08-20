import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0, temp = number;

        while (temp != 0) {
            sum += temp % 10; // Add last digit to sum
            temp /= 10; // Remove last digit
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        sc.close();
    }
}
