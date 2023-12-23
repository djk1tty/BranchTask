import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите большеее и меньшее число: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a % b == 0) {
            System.out.print("Первое число кратно второму");
        } else {
            System.out.print("Остаток от деления: " + a % b);
        }
    }
}

