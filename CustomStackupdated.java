package ArrayDeque;

public class CustomStack {
    protected  static int[] data;
private static  final int  DEFAULT_SIZE = 11;
    int ptr = -1;

public CustomStack(){
    this.data = new int[DEFAULT_SIZE];
}
public  CustomStack(int size){
    this.data = new int[size];
     }



public boolean push(int item){
    int ptr = -1;
    if(isFull()){
        System.out.println("Stack is full");
        return false;
    }
    ptr++;
    data[ptr]= item;
    return true;
}
public int pop() throws Exception{
    if(isEmpty()){
        throw  new Exception ("Cannot be popped the stack is empty: ");
    }

    int removed = data[ptr];
    ptr--;
    return removed;
}

public int peek() throws Exception{
    if(isEmpty()){
        throw new Exception("cannot be peekd the stack is empty");
    }
    return data[ptr];
}
private boolean isFull(){
    return  ptr == data.length-1;
}
private boolean isEmpty(){
    return ptr == -1;
}

}

