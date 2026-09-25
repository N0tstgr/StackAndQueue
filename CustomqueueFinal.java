

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public Codechef() {
        this(DEFAULT_SIZE);
    }

    public Codechef(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Sorry, the queue is empty");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("This is empty");
        }

        return data[0];
    }

    public void display() throws Exception {
        if (isEmpty()) {
            throw new Exception("Sorry, the queue is empty");
        }

        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws Exception {

        Codechef queue = new Codechef(5);

        queue.insert(5);
        queue.insert(2);
        queue.insert(1);
        queue.insert(9);
        queue.insert(3);

        queue.display();

        System.out.println("Removed: " + queue.remove());

        queue.display();

        System.out.println("Front: " + queue.front());
    }
}
