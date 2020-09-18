import co.edu.upb.queue.Queue;

public class Main {

    public static void main(String[] args) {
        Queue cola = new Queue(5);
        cola.insert(6);
        cola.insert(7);
        System.out.println(cola.search(5));
        System.out.println(cola.search(0));
        cola.extract();
        System.out.println(cola.search(5));
    }
}
