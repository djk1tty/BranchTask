import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x: ");

        int x = scanner.nextInt();
        int function = x * x - 16;
        int y = function;

        System.out.println("Значение функции: " + "x * x - 16");

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}