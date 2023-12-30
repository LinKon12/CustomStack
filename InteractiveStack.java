/*
Implement stack with user inputs for add and pop (add more methods)
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InteractiveStack {
    protected int[] data;
    private static final int default_size = 10;
    int index = 0;
    public InteractiveStack(){
        this.data = new int[default_size];
    }
    public InteractiveStack(int size){
        this.data = new int[size];
    }
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is Full!");
            return;
        }
        data[index] = num;
        index++;
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            }
        int removed = data[index-1];
        index--;
        return removed;

    }
    public boolean isFull() {
        return index == data.length;
    }
    public boolean isEmpty(){
        return index == 0;
        }
    public String display(){
        System.out.print("Current stack: ");
        int[] display={};
        for (int i = index-1; i >= 0; i--) {
            System.out.print(+data[i]+"->");
        }
        return "END";
    }
}








