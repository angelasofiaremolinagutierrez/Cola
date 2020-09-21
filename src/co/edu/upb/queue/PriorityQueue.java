package co.edu.upb.queue;

import java.util.Scanner;

public class PriorityQueue implements QueueInterface{
    int numPrioridades;
    Queue[] priQueue;

    public PriorityQueue(int numPrioridades) {
        this.numPrioridades = numPrioridades;
        this.priQueue = new Queue[numPrioridades];
        for (int i = 0; i < numPrioridades; i++) {
            priQueue[i] = new Queue();
        }
    }

    @Override
    public void clear() {
        for (Queue x:priQueue) {
            x.clear();
        }
    }

    @Override
    public boolean isEmpty() {
        int cont=0;
        for (Queue x:priQueue) {
            if(x.isEmpty()){
                cont++;
            }
        }
        return (cont==numPrioridades);
    }

    @Override
    public Object extract() {
        for (Queue x:priQueue) {
            if(!x.isEmpty()){
                return x.extract();
            }
        }
        return null;
    }

    @Override
    public boolean insert(Object object) {
        System.out.println("¿Qué prioridad tiene el objeto que va a ingresar?(escriba una de las siguientes opciones)");
        for (int i = 0; i <numPrioridades ; i++) {
            System.out.println(i);
        }
        Scanner scan = new Scanner(System.in);
        int prio = Integer.parseInt(scan.nextLine());
        Queue actual = priQueue[prio];
        actual.insert(object);
        return true;
    }

    @Override
    public int size() {
        int sizeTotal = 0;
        for (Queue x:priQueue) {
            sizeTotal += x.size();
        }
        return sizeTotal;
    }

    @Override
    public boolean search(Object object) {
        for (Queue x:priQueue) {
            if(x.search(object)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        for (Queue x:priQueue) {
            x.sort();
        }
    }

    @Override
    public void reverse() {
        for (Queue x:priQueue) {
            x.reverse();
        }
    }
}
