import java.util.*;

public class ATM_Transaction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of transactions:");
        int n = sc.nextInt();
        int transaction[] = new int[n];
        for (int i = 0; i < n; i++) {
            transaction[i] = sc.nextInt();
        }
        sc.close();
        balance(transaction);
    }

    public static void balance(int[] transaction) {
        int balance = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (balance < 0) {
                System.out.println("OverDraft");
            } else if (transaction[i] > 0) {
                balance += transaction[i];
                System.out.println("Deposit: " + transaction[i] + " Balance: " + balance);
            } else {
                balance += transaction[i];
                System.out.println("Withdraw: " + (transaction[i]) + " Balance: " + balance);
            }
        }
        System.out.println("total balance=" + balance);

    }
}
