package oops;

class DerivedClass extends BaseClass {
    int num = 2911;

//    @Override
    public static void fly() {
        System.out.println("Yes, static method can be inherited");
    }

    final public void walk() {
        System.out.println("Yes, I can walk");
    }
}