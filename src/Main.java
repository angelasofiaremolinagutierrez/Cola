import co.edu.upb.queue.Queue;

public class Main {

    public static void main(String[] args) {
        Queue cola = new Queue(7);
        cola.insert(6);
        cola.insert(5);
        System.out.println(cola.toString());
        cola.sort();
        System.out.println(cola.toString());
    }
}
