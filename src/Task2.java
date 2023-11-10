import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line= new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            line[i] = scanner.nextLine();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (line[j].length() > line[j + 1].length()) {
                    String temp = line[j];
                    line[j] = line[j + 1];
                    line[j + 1] = temp;
                }
            }
        }
        System.out.println("Строки в порядке возрастания длины:");
        for (String str : line) {
            System.out.println(str);
        }
    }
}
