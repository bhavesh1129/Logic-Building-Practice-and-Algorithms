package oops;

public class BaseClass {
    static int num = 1129;

    public static void fly() {
        System.out.println("Yes, I can fly");
    }

//    final public void walk() {
//        System.out.println("Yes, I can walk");
//    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        DerivedClass dc = new DerivedClass();
        BaseClass bd = new DerivedClass();
        bd.fly();
        dc.fly();
//        System.out.println(bd.num);
//        System.out.println(dc.num);
//        bc.fly();
    }
}

