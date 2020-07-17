package com.arena;

import java.util.Arrays;

public class ArrayQueueEx {
    private int[] items;
    private int front;
    private int rear;
    private int count;

    public ArrayQueueEx(int items) {
        this.items = new int[items];
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        // circular array concept
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        int item = items[front];
        items[front] = 0;
        // circular array concept
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    @Override
    public String toString(){
         return Arrays.toString(items);
    }

}
