import java.util.*;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[] = new String[n];
        int salary[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your name:");
            name[i] = sc.next();
            System.out.println("Enter your salary:");
            salary[i] = sc.nextInt();
        }
        sc.close();
        CalcSalary(salary, name);
    }

    public static int[] CalcSalary(int[] salary, String[] name) {
        for (int i = 0; i < salary.length; i++) {
            double HRA = salary[i] * 0.2;
            double DA = salary[i] * 0.10;
            salary[i] = (int) (salary[i] + HRA + DA);
            System.out.println("Employee Name: " + name[i]);
            System.out.println("Total Salary: " + salary[i]);
            if (salary[i] > 5000) {
                salary[i] = (int) (salary[i] - salary[i] * 0.10);
                System.out.println("Salary after 10% discount: " + salary[i]);
            }
        }
        return salary;

    }
}