package String_Handling;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        System.out.println("String after removing duplicates: " + sb);
        sc.close();
    }
}
