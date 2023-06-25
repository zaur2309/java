package homework.homeWork1;

import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите операцию +,-,*,/: ");
        String oper = sc.nextLine();
        System.out.println("Введите второе число: ");
        int number2 = sc.nextInt();
        sc.close();
        calculate(number1, oper, number2);

    }
/**
 * @ApiNote реализоваь простой калькулятор
 * @param n1 первое число
 * @param oper операция
 * @param n2 второе число
 */
    public static void calculate(int n1, String oper, int n2) {
        if (oper.equals("*")){
            System.out.println(n1*n2);
        }
        if (oper.equals("/")){
            System.out.println(n1/n2);
        }
        if (oper.equals("+")){
            System.out.println(n1+n2);
        }
        if (oper.equals("-")){
            System.out.println(n1-n2);
        }
    }

}
// Реализовать простой калькулятор