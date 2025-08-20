import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ages
        System.out.print("Enter Amar's age: ");
        int age1 = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int age2 = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int age3 = sc.nextInt();
        // Heights
        System.out.print("Enter Amar's height: ");
        double h1 = sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double h2 = sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double h3 = sc.nextDouble();
        // Youngest
        String youngest = (age1 <= age2 && age1 <= age3) ? "Amar"
                : (age2 <= age1 && age2 <= age3) ? "Akbar" : "Anthony";
        // Tallest
        String tallest = (h1 >= h2 && h1 >= h3) ? "Amar" : (h2 >= h1 && h2 >= h3) ? "Akbar" : "Anthony";
        System.out.println("The youngest friend is " + youngest + ".");
        System.out.println("The tallest friend is " + tallest + ".");
        sc.close();
    }
}
