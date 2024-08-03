// This program demonstrates the use of functional interfaces in Java

// Functional interface (only one abstract method)
@FunctionalInterface
interface MyFunctionalInterface {
    void singleMethod();

    // It can have default and static methods
    default void defaultMethod() {
        System.out.println("Default method in functional interface.");
    }

    static void staticMethod() {
        System.out.println("Static method in functional interface.");
    }
}

// Class implementing the functional interface
class FunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void singleMethod() {
        System.out.println("Single abstract method implementation.");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface myFuncInterface = new FunctionalInterfaceImpl();
        myFuncInterface.singleMethod();
        myFuncInterface.defaultMethod();
        MyFunctionalInterface.staticMethod();
    }
}
