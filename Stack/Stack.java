public class Stack {

    int size;
    int top;
    int[] array;

    // Constructor to initialize stack with given capacity
    public Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
    }

    // Check if the stack is full
    boolean isFull() {
        return (top == size - 1);
    }

    // Check if the stack is empty
    boolean isEmpty() {
        return (top == -1);
    }

    // Push operation to insert an element into the stack
    void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Overflow");
        } else {
            array[++top] = item;
        }
    }

    // Pop operation to remove and return the top element from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1; // Or throw an exception to handle this case
        } else {
            return array[top--];
        }
    }

    // Display the elements of the stack
    void showArray() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
