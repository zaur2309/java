package homework.homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(100, 5, 45, 55, 66, 72, 94, 8, 5, 7, 56, 32));
        System.out.println(list);
        deleteEven(list);
        System.out.println(list);
        list.sort(null);   
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println((float)sumArrayNumbers(list) / list.size());

    }


    public static void deleteEven(ArrayList<Integer> array){
        for(int i=0; i < array.size(); i++){
            if (array.get(i)%2 == 0){
                array.remove(i);
                i--;
            }
        }
    }


    public static int sumArrayNumbers(ArrayList<Integer> array){
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        return sum;
    }






    
}




// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение