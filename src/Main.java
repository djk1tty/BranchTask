// 1 задача branch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = input.nextInt();

        System.out.println("Введите второе число: ");
        int b = input.nextInt();

        System.out.println("Введите третье число: ");
        int c = input.nextInt();

        int d = 0;

        if (a > b) {
            d = a;
        } else {
            d = b;
        }

        if (d > c) {
        } else {
            d = c;
        }
        System.out.print("Максимальное число: " + d);
    }
}
