package com.arena.old;

import javax.crypto.spec.PSource;
import java.util.*;

public class Main {

    public static void main1 (String[] args) {

       /*ArraysEx numbers = new ArraysEx(3);
        numbers.print();
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println("max: "+ numbers.max());
        System.out.println("min: "+ numbers.min());
        numbers.reverse();

        // ******IMPLEMENT THIS***********
        numbers.insertAt(15,2);
        numbers.print();*/

       /* LinkedListEx listEx = new LinkedListEx();

        listEx.addLast(12);
        listEx.addLast(13);
        listEx.addLast(14);
        int[] list = listEx.toArray();
        System.out.println(Arrays.toString(list));
        System.out.println(listEx.size());
        listEx.reverseList();
        System.out.println((listEx.getKthFromThEnd(3)));*/

       /* StackEx stack = new StackEx(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());*/

       /* Queue queue = new ArrayDeque();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);*/

       /* ArrayQueueEx queue = new ArrayQueueEx(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        System.out.println(queue);*/

       /*QueueWithTwoStack qws = new QueueWithTwoStack();
        qws.enqueue(10);
        qws.enqueue(20);
        qws.enqueue(30);
        qws.dequeue();
        qws.dequeue();
        int first = qws.dequeue();
        System.out.println(first);*/

       /*PriorityQueueEx queueEx = new PriorityQueueEx();
        queueEx.add(5);
        queueEx.add(3);
        System.out.println(queueEx.toString());*/

       /* HashTableEx hashTableEx = new HashTableEx();
        char ch = hashTableEx.getUniqueElements( "a green apple");
        System.out.println(ch);*/

       /*HashTableEx hash = new HashTableEx();
        hash.put(6,"A");
        hash.put(8,"B");
        hash.put(11,"C");
        hash.put(6,"A+");
        hash.remove(6);
        System.out.println(hash.get(96));*/

        //  ThreadDemo threadDemo = new ThreadDemo();
        // threadDemo.show();
        
        /*TreeEx treeEx = new TreeEx();
        treeEx.insert(7);
        treeEx.insert(4);
        treeEx.insert(9);
        treeEx.insert(1);
        treeEx.insert(6);
        treeEx.insert(8);
        treeEx.insert(10);
        System.out.println("Done");*/

      /*  int x = 3 & 5; // 011 & 101 = 001 = 1
        int y = 3 | 5;   // 011 | 101 = 111 = 7
        System.out.println("x & y " + x + " " + y);

        try {
            bad();
            System.out.println("A");
        } catch (Exception e){
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
        */

    }

    public static void bad(){}

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.empty()){
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }

}
