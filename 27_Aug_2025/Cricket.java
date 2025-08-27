import java.util.*;

public class Cricket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of runs scored by each batsman:");
        int n = sc.nextInt();
        int runs[] = new int[n];
        for (int i = 0; i < n; i++) {
            runs[i] = sc.nextInt();
        }
        sc.close();
        score(runs);

    }

    public static void score(int[] runs) {
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int century = 0;
        for (int i = 0; i < runs.length; i++) {
            if (runs[i] > highest) {
                highest = runs[i];
            }
            if (runs[i] < lowest) {
                lowest = runs[i];
            }
            if (runs[i] >= 100) {
                century = runs[i];
            }
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Century scorer: " + century);
        int avg = 0;
        for (int i = 0; i < runs.length; i++) {
            avg += runs[i];
        }
        System.out.println("Average score: " + (avg / runs.length));
    }
}
