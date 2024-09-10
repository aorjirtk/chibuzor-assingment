package javaScriptAssignment;
import java.util.Arrays;
public class JavaScriptAssignmentOne {
    public int[]  sortArraysInReverse(int [] num) {
        int numbers[] = new int[num.length];
        int index = 0;
        for (index = num.length - 1; index > 0; index--) {
            numbers[index] = num[index];
        }
        return numbers;
    }
}

