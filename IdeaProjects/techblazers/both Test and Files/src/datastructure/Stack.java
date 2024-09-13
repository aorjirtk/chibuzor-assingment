package datastructure;

import java.util.Objects;

public class Stack {
    private int stackSize;
    String [] stackArray;

    public Stack(int capacity) {
        stackArray = new String[capacity];

    }

    public boolean checkIfStackIsEmpty() {
        return stackSize == 0;

    }

    public void push(String value) {
        if(isFull())throw new IllegalArgumentException("Stack is fuull");
        stackArray[stackSize] = value;
        stackSize++;
        if(stackSize > stackArray.length) {
            throw new IllegalArgumentException("Stack is full");
        }
    }
    public String pop() {
        return stackArray[--stackSize];
    }
    public Boolean isFull() {
        return stackSize == stackArray.length;
    }

}
