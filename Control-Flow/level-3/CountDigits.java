import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        do {
            temp /= 10;
            count++;
        } while (temp != 0);

        System.out.println("Number of digits in " + number + " is: " + count);

        sc.close();
    }
}
