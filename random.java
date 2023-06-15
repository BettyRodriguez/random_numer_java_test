import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        int min = scanner.nextInt();

        System.out.print("Введите конец диапазона: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Случайное число из диапазона [" + min + ", " + max + "]: " + randomNumber);
    }
}
