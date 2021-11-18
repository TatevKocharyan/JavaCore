package chapter6;

public class Stack {
    int[] array;
    int index;


    Stack() {
        int[]array=new int [10];
        index = -1;

    }

    Stack(int length){
        int []array=new int[length];
        index =-1;


    }
    void push(int item) {

        if (index == array.length-1) {
            System.out.println("Stack is full");

        } else {
            array[++index] = item;
        }
    }


    int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
           return array[index--];


        }


    }


}