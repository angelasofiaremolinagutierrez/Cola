package co.edu.upb.queue;

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
        //todo

        return null;
    }

    @Override
    public boolean insert(Object object) {
        //todo
        return false;
    }

    @Override
    public int size() {
        //todo
        return 0;
    }

    @Override
    public boolean search(Object object) {
        //todo
        return false;
    }

    @Override
    public void sort() {
        //todo
    }

    @Override
    public void reverse() {
        //todo
    }
}
