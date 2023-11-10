import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            line[i] = scanner.nextLine();
        }
        for (String s : line) {
            boolean uniqueChars = true;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        uniqueChars = false;
                        break;
                    }
                }
                if (!uniqueChars) {
                    break;
                }
            }
            if (uniqueChars) {
                System.out.println("Слово из различных символов: " + s);
                break;
            }
        }

    }
}
