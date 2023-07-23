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
        System.out.println();
        ll.enqueue();  
        ll.print();
        System.out.println();
        Integer num = ((Integer)ll.dequeue());
        ll.print(); 
        System.out.println("num = " + num);
        Integer num2 = ((Integer)ll.first());
        System.out.println("num2 = " + num2);  
    }
}
