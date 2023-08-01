package homework.homework4.task3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.printf("хотите отменить последнюю операцию? [да] или [нет]: ");
        Scanner scanner = new Scanner(System.in);
        String delete = scanner.nextLine();
        del(delete);

        try {
            File file = new File("homework\\homework4\\task3\\log.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите операцию (+ - * /): ");
            char op = scanner.nextLine().charAt(0);
            System.out.print("Введите второе чис ло: ");
            int b = Integer.parseInt(scanner.nextLine());
            

            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + add(a, b));
                    fileWriter.write(a + " + " + b + " = " + add(a, b) + '\n');
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + minus(a, b));
                    fileWriter.write(a + " - " + b + " = " + minus(a, b) + '\n');
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + multi(a, b));
                    fileWriter.write(a + " * " + b + " = " + multi(a, b) + '\n');
                    break;
                case '/':
                    System.out.println(a + " / " + b + " = " + divide(a, b));
                    fileWriter.write(a + " / " + b + " = " + divide(a, b) + '\n');
                    break;
                default:
                    System.out.println("Wrong operation!");
                    break;
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Исключение при работе с файлом.");
        }

    }

    private static void del(String str) {
        StringBuilder sb = new StringBuilder();
        if (new String ("да").equals(new String(str))) {
            try (FileReader reader = new FileReader("homework\\homework4\\task3\\log.txt")) {
                // читаем посимвольно
                int c;
                while ((c = reader.read()) != -1) {
                    sb.append(Character.toString(c));
                }
            } catch (Exception ex) {
                System.out.println("Неверно указан исходный или конечный файл(");
            }
            System.out.println("sb = " + sb);
            String[] arr = sb.toString().split("/n");
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < arr.length - 3; i++) {
                s.append(arr[i]).append("/n");
            }

            try {
                FileWriter fw = new FileWriter("homework\\homework4\\task3\\log.txt", false);
                fw.write(s.toString());
                fw.close();
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

}
