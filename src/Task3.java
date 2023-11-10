import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            line[i] = scanner.nextLine();
        }
        int totalLength = 0;
        for (String s : line) {
            totalLength += s.length();
        }
        double averageLength = (double) totalLength / line.length;
        System.out.println("Строки, длина которых меньше средней:");
        for (String s : line) {
            if (s.length() < averageLength) {
                System.out.println(s + ", длина: " + s.length());
            }
        }
    }
}
