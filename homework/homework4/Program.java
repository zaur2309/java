package homework.homework4;

import java.util.Arrays;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, -1, -1, 2, 3, 8, -6));
        MyQueue ll = new MyQueue<>(numbers);
        ll.print();
        ll.reverseLL();
        System.out.println();
        ll.print();
    }
}
