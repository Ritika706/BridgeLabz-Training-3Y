import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: month (1–12), day, year
        System.out.print("Enter month (1=Jan, ..., 12=Dec): ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        // Step 1: y0 = y - (14 - m) / 12
        int y0 = y - (14 - m) / 12;

        // Step 2: x = y0 + y0/4 - y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: m0 = m + 12 * ((14 - m) / 12) - 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: d0 = (d + x + (31 * m0) / 12) % 7
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of the week (0=Sunday, ..., 6=Saturday): " + d0);

        sc.close();
    }
}
