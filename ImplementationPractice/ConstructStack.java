package ImplementationPractice;

import java.util.*;

public class ConstructStack {
    private static List<Integer> list;

    public ConstructStack() {
        this.list = new ArrayList<>();
    }

    public void push(int val) {
        list.add(val);
    }

    public int size() {
        return list.size();
    }

    public int pop() {
        int size = list.size();
        return list.remove(size - 1);
    }

    public void display() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        ConstructStack st = new ConstructStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
//        System.out.println(st.size());
        st.display();
        st.pop();
        st.display();
    }
}
