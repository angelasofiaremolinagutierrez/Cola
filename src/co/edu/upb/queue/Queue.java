package co.edu.upb.queue;

import java.util.Arrays;

public class Queue implements QueueInterface{

    public QueueNode head;
    public QueueNode tail;

    private int size = 0;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public Queue(Object object) {
        insert(object);
    }


    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public boolean isEmpty() {
        return (this.size == 0);
    }

    @Override
    public Object extract() {
        if(isEmpty()){
            return null;
        }else{
            Object oldHead = this.head.getObject();
            this.head = this.head.next;
            this.size = this.size-1;
            return oldHead;
        }
    }

    @Override
    public boolean insert(Object object) {
        QueueNode newNode = new QueueNode(object);
        if(isEmpty()){
            this.head = newNode;
            this.tail = this.head;
        }else{
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
        this.size = this.size+1;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean search(Object object) {
        if (!isEmpty()) {
            QueueNode node = this.head;
            for (int i = 0; i < this.size; i++) {
                if (node.getObject().equals(object)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        Object[] colaAOrdenar = new Object[this.size];
        QueueNode node = this.head;
        for (int i = 0; i <this.size ; i++) {
            colaAOrdenar[i] = node.getObject();
            node = node.next;
        }

        Arrays.sort(colaAOrdenar);

        Queue colaOrdenada = new Queue();
        for (Object n:colaAOrdenar) {
            colaOrdenada.insert(n);
        }

        this.head = colaOrdenada.head;
        this.tail = colaOrdenada.tail;
    }

    @Override
    public void reverse() {
        Object[] colaAinvertir = new Object[this.size];
        QueueNode node = this.head;
        for (int i = 0; i <this.size ; i++) {
            colaAinvertir[i] = node.getObject();
            node = node.next;
        }
        Queue temp = new Queue();
        for (int i = colaAinvertir.length-1; i >= 0; i--) {
            temp.insert(colaAinvertir[i]);
        }
        this.head = temp.head;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
