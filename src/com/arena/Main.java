package com.arena;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){

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

        LinkedListEx listEx = new LinkedListEx();


                int[] A = {5,3,2,7,9};
                int[] outPut = new int[2];

                for(int i = 0; i < A.length; i++){
                    for(int j = 0; j < A.length; j++){
                        if(A[i]+A[j] == 7){
                            outPut[0] = i;
                            outPut[1] = j;
                            System.out.println("output: "+Arrays.toString(outPut));
                        }
                    }
                }


    }

}
