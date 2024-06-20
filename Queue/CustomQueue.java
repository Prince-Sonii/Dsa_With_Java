package Queue;

public class CustomQueue {
    int[] data;
    int DEFAULT_SIZE = 5;
    int pointer = -1;
    CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }
    CustomQueue(int size) {
        this.data = new int[size];
    }
    public void add(int value) throws Exception{
        if(isFull()) {
            throw new Exception("Queue is full");
        }
        pointer++;
        data[pointer] = value;
    }
    public int remove() throws Exception{
        if(isEmpty()) {
            throw new Exception("queue is empty");
        }
        int val = data[0];
        for (int i = 0; i <pointer ; i++) {
            data[i]= data[i+1];
        }
        data[pointer--] =0;
        return val;
    }

    private boolean isEmpty() {
        return pointer==-1;
    }

    public boolean isFull() {
        return pointer == data.length-1;
    }
    public void display() {
        for (int i=0;i<=pointer;i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.println("END");
    }
}
