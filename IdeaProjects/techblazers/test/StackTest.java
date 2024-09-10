import datastructure.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;
    @BeforeEach
    public void setUp() {
        stack = new Stack(3);
    }
    @Test
    public void testStackExistsAndItsEmpty() {
        assertTrue( stack.checkIfStackIsEmpty());
    }
    @Test
    public void testStackCanPushOneValue() {
        stack.push("Olufemi");
        assertFalse( stack.checkIfStackIsEmpty());
    }
    @Test
    public void testStackCanPopOneValues() {
        stack.push("Olufemi");
        stack.pop();
        assertTrue( stack.checkIfStackIsEmpty());
    }
    @Test
    public void testStackCanPushAndPopMultipleValues() {
        stack.push("Olufemi");
        stack.push("james");
        stack.pop();
        assertFalse( stack.checkIfStackIsEmpty());
    }
    @Test
    public void testStackCanPopOnlyValuesPushedIn() {
        stack.push("Olufemi");
        stack.pop();
        assertTrue( stack.checkIfStackIsEmpty());
    }

    @Test
    public void testStackCanPushXAndPOPx(){
        stack.push("Olufemi");
        assertEquals("Olufemi", stack.pop());
    }
    @Test
    public void testStackCanPopXYZAndPOPZY(){
        stack.push("Olufemi");
        stack.push("james");
        stack.push("mark");
        assertEquals("mark", stack.pop());
        assertEquals("james", stack.pop());
    }
    @Test
    public void testStackCannotReceiveValuesMoreThanCapacity() {
        stack.push("Olufemi");
        stack.push("james");
        stack.push("mark");
        //stack.push("williams");
        assertThrows(IllegalArgumentException.class, () -> stack.push("stack is full"));

    }
}
