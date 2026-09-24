import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    int[] data;
    
    private static final int DEFAULT_SIZE = 10;
    
    int end = -1;
    
    public customqueue(){
        this(DEFAULT_SIZE);
    }
    
    public customqueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end  ==-1;
    }

	
	
}
