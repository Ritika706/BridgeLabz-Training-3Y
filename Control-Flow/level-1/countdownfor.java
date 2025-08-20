import java.util.Scanner;

public class countdownfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter counter value: ");
        int counter = sc.nextInt();
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Lift Off!");
        sc.close();
    }
}
