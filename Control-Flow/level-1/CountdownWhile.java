import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter counter value: ");
        int counter = sc.nextInt();
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Lift Off!");
        sc.close();
    }
}
