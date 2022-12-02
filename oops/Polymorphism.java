package oops;

public class Polymorphism {

    public void display(double num) {
        System.out.println("Given input by user is " + num);
    }

    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        p.display(1);
        p.display(1.11);
    }
}

