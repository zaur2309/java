package homework.homework4;


import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> elements = new LinkedList<E>();

    public MyQueue(LinkedList<E> elements) {
        this.elements = elements;
    }


    public MyQueue() {}


    public LinkedList<E> getElements() {
        return elements;
    }


    public void setElements(LinkedList<E> elements) {
        this.elements = elements;
    }


    public LinkedList<E> reverseLL() {
        if (elements.size() <= 1) return elements;
        for (int i = 0; i < elements.size() / 2; i++) {
            E temp = elements.get(i);
            elements.set(i, elements.get(elements.size() - i - 1));
            elements.set(elements.size() - i - 1, temp);
        }
        return elements;
    }


    public void print(){
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
    }


    public LinkedList<E> enqueue() {
        E value = this.elements.get(0);
        this.elements.removeFirst();
        this.elements.addLast(value);
        return this.elements;
    }


    public E dequeue(){
        E value = this.elements.get(0);
        this.elements.removeFirst();
        return value;
    }

    public E first(){
        return this.elements.get(0);
    }
}
