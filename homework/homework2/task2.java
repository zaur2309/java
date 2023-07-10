// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package homework.homework2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Задайте длину массива: ");
        int len = in.nextInt();
        in.close();
        int[] a = createArray(len);
        printArray(a);
        bubbleSort(a);
        printArray(a);
    }
    /**
     * @ApiNote Метод для создания массива
     * @param size длина массива
     * @return arr рандомный массив
     */
    public static int[] createArray(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(0, 50);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        StringBuilder logString = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
                logString.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter fw = new FileWriter("homework\\homework2\\task2log.txt", false);
                    fw.write(logString.toString());
                    fw.close();
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());;
                }

            }
        }
    }

   

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.println();
    }

}
