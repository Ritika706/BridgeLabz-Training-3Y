import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        int counter = 1;
        if (number > 0 && number < 100) {
            System.out.print("Multiples: ");
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println();
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
