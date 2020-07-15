package com.arena;

import java.util.NoSuchElementException;

public class LinkedListEx {

    private class Node {
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    //addFirst
    public void addFirst(int item){
        Node node = new Node(item);
        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
    }

    //addLast
    public void addLast(int item){
       Node node = new Node(item);
       if(isEmpty())
           first = last = node;
       else {
           last.next = node;
           last = node;
       }
       size++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    //deleteFisrt
    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
            size = 0;
            return;
        }

        Node second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    //deleteLast
    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
            size = 0;
            return;
        }

        Node previous = getPrevious(last);
        last = previous;
        last.next = null;
        size--;
    }

    //get previous of last
    private Node getPrevious(Node node){
        Node current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //contains
    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    //indexOf
    public int indexOf(int item){
        int index = 0;
        Node current = first;

        while(current != null){
            if(current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    //size
    public int size(){
        return size;
    }

    //toArray
    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

}
