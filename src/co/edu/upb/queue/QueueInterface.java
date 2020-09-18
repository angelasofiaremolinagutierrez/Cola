package co.edu.upb.queue;

import java.util.Iterator;

public interface QueueInterface {

    /*
    essential operations
    */
    public void clear();

    public boolean isEmpty();

    public Object extract();

    public boolean insert(Object object);

    public int size();

    public boolean search(Object object);

    /*
    expansion operations
     */
    public void sort();

    public void reverse();

    public String toString();
}
