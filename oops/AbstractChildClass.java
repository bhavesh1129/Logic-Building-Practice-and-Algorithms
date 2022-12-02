package oops;

public class AbstractChildClass extends AbstractParentClass {
    AbstractChildClass(double dim1, double dim2) {
        super(dim1, dim2);
    }

    // override area for rectangle
    @Override
    double area() {
        System.out.println("Inside Area for AbstractChildClass.");
        return dim1 * dim2;
    }

    @Override
    int getYourNum() {
        return 0;
    }
}
