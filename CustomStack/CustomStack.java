package CustomStack;

import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    int pointer = -1;
    CustomStack() {
        this(DEFAULT_SIZE);
    }
    CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int value) throws Exception{
        if(isFull()) {
            int[]temp = new int[this.data.length*2];
            for (int i = 0; i <this.data.length ; i++) {
                temp[i] = data[i];
            }
            this.data= temp;
        }
        pointer++;
        data[pointer] = value;
        return true;
    }

    private boolean isFull() {
        return pointer==this.data.length-1;
    }
    public int pop() throws Exception{
        if(isEmpty()) {
            throw new Exception("stack is empty");
        }
        int value = data[pointer];
        this.data[pointer] = 0;
        pointer--;
        return value;
    }

    private boolean isEmpty() {
        return pointer==-1;
    }
}
