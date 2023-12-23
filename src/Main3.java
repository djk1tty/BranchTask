import java.util.Scanner;


public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одно чётное и нечётное число: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 2 == 0){
            System.out.print("Нечётное число: " + b);
        }
        else{
            System.out.print("Нечётное число: " + a);
        }

    }
}

