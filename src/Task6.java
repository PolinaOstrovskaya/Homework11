import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        System.out.print("Введите номер слова для проверки: ");
        int wordIndex = scanner.nextInt();
        if (wordIndex < 1 || wordIndex > words.length) {
            System.out.println("Ошибка: указан неверный номер слова");
        } else {
            String wordToCheck = words[wordIndex - 1];
            if (isPalindrome(wordToCheck)) {
                System.out.println("Слово \"" + wordToCheck + "\" является палиндромом");
            } else {
                System.out.println("Слово \"" + wordToCheck + "\" не является палиндромом");
            }
        }
    }

    private static boolean isPalindrome(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }
}
