import java.util.*;
import java.lang.*;
import java.io.*;

class CircularQueue {

   protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
    


    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }
    
    public int removed() throws Exception{
        if(isEmpty()){
            throw new Exception("this is Empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }
    
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    
    public void display() throws Exception{
         if(isEmpty()){
             System.out.println("Empty");
             return;
         }
         int i = front;
         do{
             System.out.print(data[i] + " -> ");
             i++;
             i = i%data.length;
         }while(i!=end);
         System.out.println("End");
    }
      public static void main(String[] args) throws Exception {
          CircularQueue queue = new CircularQueue(5);
          queue.insert(5);
          queue.insert(2);
          queue.insert(9);
          queue.insert(8);
          queue.insert(5);
          
          queue.display();
          System.out.println(queue.removed());
          queue.insert(45);
          queue.display();
          
          System.out.println(queue.removed());
          queue.insert(665);
          queue.display();
      }
}    
