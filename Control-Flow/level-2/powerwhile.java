import java.util.Scanner;

public class powerwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        if (number > 0 && power >= 0) {
            int result = 1;
            int counter = 1;
            while (counter <= power) {
                result *= number;
                counter++;
            }
            System.out.println(number + "^" + power + " = " + result);
        } else {
            System.out.println("Please enter a positive integer for the base and non-negative integer for the power.");
        }
        sc.close();
    }
}
