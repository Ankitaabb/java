import java.util.Scanner;

public class vandc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelsCount = 0, consonantsCount = 0;
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        scanner.close();
    }
}
