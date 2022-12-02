package oops;

public class InterfaceChildClass implements InterfaceParentClass, InterfaceParent2 {
    int speed;
    int gear;

    //to change gear
    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public String myName() {
        return "Child Interface Class";
    }

    public void currentState() {
        System.out.println("My speed: " + speed + "\n" + "My gear: " + gear);
    }

    public static void main(String[] args) {
        InterfaceChildClass bicycle = new InterfaceChildClass();

        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.currentState();
        System.out.println(bicycle.myName());
    }
}
