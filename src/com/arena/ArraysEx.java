package com.arena;

import java.util.Arrays;

public class ArraysEx {

    private int[] items;

    private int count = 0;

    public ArraysEx(int length) {
        items = new int[length];
    }

    public void insert(int item){

        if(items.length == count ) {
            int[] newItems = new int[2*count];

            for(int i = 0; i < count; i++)
                newItems[i] = items[i];

            items = newItems;

        }

        items[count++] = item;
    }

    public void print(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }

    public void removeAt(int index){
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count; i++ )
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(items[i] == item )
                return i;

        return -1;
    }

    public int max(){
        int maxValue = items[0];
        for(int i = 1; i < count; i++) {
            if (items[i] > maxValue)
                maxValue = items[i];
        }
        return maxValue;
    }

    public int min(){
        int minValue = items[0];
        for(int i = 1; i < count; i++) {
            if (items[i] < minValue)
                minValue = items[i];
        }
        return minValue;
    }

    public void intersect(int[] array1, int[] array2){
        if(array1.length > 0 && array2.length > 0)
            for(int i = 0; i < array1.length; i++)
                for(int j = 0; j < array2.length; j++)
                    if(array1[i] == array2[j])
                        System.out.println("common items: "+ array1[i]);

    }

    public void reverse(){
        int[] reverseItems = new int[items.length];
        int counter = 0;
        for(int i = items.length; i > 0; i--)
            reverseItems[counter++] = items[i - 1];
        System.out.println("reverseItems: " + Arrays.toString(reverseItems));
    }

    // IMPLEMENT THIS
    public void insertAt(int item, int index){}

}
