package homework.homeWork1;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = sc.nextInt();
        sc.close();
        Simple(n);
    }
    
    /**
     * @ApiNote Вывести все простые числа от 1 до 1000
     * @param N кл-во чисел
     */
    public static void Simple(int N) { 
        for(int num = 1; num <= N; num++){ 
            boolean simple = true; 
            for(int i = 2; i * i <= num; i++){ 
                if(num % i == 0){ 
                    simple = false; 
                    break;
                }
            }
            if(simple) { 
                System.out.printf("%d ", num);
            }
        }
    }
}