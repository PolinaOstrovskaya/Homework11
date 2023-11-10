import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = new String[1];
        for (int i = 0; i < 1; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            line[i] = scanner.nextLine();
        }
        StringBuilder duplicatedString = new StringBuilder();
        for (String s : line) {
            for (int i = 0; i < s.length(); i++) {
                duplicatedString.append(s.charAt(i)).append(s.charAt(i));
            }
        }
        System.out.println("Новая строка с задублированными буквами: " + duplicatedString.toString());
    }
}
