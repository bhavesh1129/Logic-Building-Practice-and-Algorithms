package oops;

public abstract class AbstractParentClass {
    double dim1;
    double dim2;

    AbstractParentClass(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // area is now an abstract method
    abstract double area();

    abstract int getYourNum();
}
