import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            line[i] = scanner.nextLine();
        }
        String shortest = line[0];
        String longest = line[0];
        for (int i = 1; i < 3; i++) {
            if (line[i].length() < shortest.length()) {
                shortest = line[i];
            }
            if (line[i].length() > longest.length()) {
                longest = line[i];
            }
        }
        System.out.println("Самая короткая строка: " + shortest + ", длина: " + shortest.length());
        System.out.println("Самая длинная строка: " + longest + ", длина: " + longest.length());
    }
}

