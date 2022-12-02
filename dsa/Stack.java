package dsa;

public class Stack {
    private int[] data = new int[5];
    private int tos = -1;

    public int size() {
        return tos + 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(int val) throws Exception {
        if (tos + 1 == data.length) {
            throw new Exception("Stack Overflow!");
        } else {
            tos++;
            data[tos] = val;
        }
    }

    public int pop() throws Exception {
        int temp;
        if (tos == -1) {
            throw new Exception("Stack Underflow!");
        } else {
            temp = data[tos];
            data[tos] = 0;
            tos--;
        }
        return temp;
    }

    public int peek() throws Exception {
        if (size() == 0) {
            throw new Exception("Stack is Empty!");
        } else {
            return data[tos];
        }
    }

    public void display() throws Exception {
        if (size() == 0) {
            throw new Exception("Stack is Empty!");
        } else {
            System.out.print("[");
            for (int i = tos; i >= 0; i--) {
                System.out.print(data[i] + ",");
            }
            System.out.println("]");
        }
    }
}
