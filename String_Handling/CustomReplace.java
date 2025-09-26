package String_Handling;

import java.util.Scanner;

public class CustomReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = sc.nextLine();
        System.out.print("Enter target substring: ");
        String target = sc.nextLine();
        System.out.print("Enter replacement string: ");
        String replacement = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            if (index + target.length() <= str.length() &&
                    str.substring(index, index + target.length()).equals(target)) {
                sb.append(replacement);
                index += target.length();
            } else {
                sb.append(str.charAt(index));
                index++;
            }
        }

        System.out.println("Modified String: " + sb);
        sc.close();
    }
}
