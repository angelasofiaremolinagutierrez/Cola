package co.edu.upb.queue;

public class QueueNode implements Comparable<QueueNode> {

    private Object object;
    public QueueNode next;

    public QueueNode(){
        this.object = null;
        this.next = null;
    }

    public QueueNode(Object object){
        this.object = object;
        this.next = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }

    public boolean isEquals(QueueNode nodo){ //si un nodo es igual a otro
        return this.toString().equals(nodo.toString());
    }

    @Override
    public int compareTo(QueueNode n1) {
        return (this.getObject().toString()).compareTo(n1.getObject().toString());
    }
}
