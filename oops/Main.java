package oops;

public class Main {

    public static void main(String args[]) {
//        AbstractParentClass parent = new AbstractParentClass(); // illegal now
        AbstractChildClass child = new AbstractChildClass(5, 5);
        System.out.println("Area is " + child.area());

        AbstractParentClass mix = new AbstractChildClass(9, 5); // this is OK, no object is created
        System.out.println("Area is " + mix.area());

    }
}
