package homework.homeWork1;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = sc.nextInt();
        sc.close();
        task1(n);

    }

    public static void task1(int n) {
        int sumNumbers = 0;
        int product = 1;
        for (int i = 1; i < n + 1; i++) {
            sumNumbers += i;
            product *= i;
        }
        System.out.println(sumNumbers + ", " + product);
    }

}
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)