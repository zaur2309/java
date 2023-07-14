package homework.homework2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task3 {
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
     * @param n1   первое число
     * @param oper операция
     * @param n2   второе число
     */
    public static void calculate(int n1, String oper, int n2) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("homework\\homework2\\task3log.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                sb.append(Character.toString(c));
            }
            sb.toString();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        if (oper.equals("*")) {
            sb.append(n1).append(" * ").append(n2).append(" = ").append(n1 * n2).append("\n");
            System.out.println(n1 * n2);
        }
        if (oper.equals("/")) {
            sb.append(n1).append(" / ").append(n2).append(" = ").append(n1 / n2).append("\n");
            System.out.println(n1 / n2);
        }
        if (oper.equals("+")) {
            sb.append(n1).append(" + ").append(n2).append(" = ").append(n1 + n2).append("\n");
            System.out.println(n1 + n2);
        }
        if (oper.equals("-")) {
            sb.append(n1).append(" - ").append(n2).append(" = ").append(n1 - n2).append("\n");
            System.out.println(n1 - n2);
        }
        try {
            FileWriter fw = new FileWriter("homework\\homework2\\task3log.txt", false);
            fw.write(sb.toString());
            fw.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
