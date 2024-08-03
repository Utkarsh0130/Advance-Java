// This program demonstrates the use of normal interfaces in Java

// Normal interface (multiple abstract methods)
interface MyNormalInterface {
    void methodOne();
    void methodTwo();
}

// Class implementing the normal interface
class NormalInterfaceImpl implements MyNormalInterface {
    @Override
    public void methodOne() {
        System.out.println("Method one implementation.");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method two implementation.");
    }
}

public class NormalInterfaceExample {
    public static void main(String[] args) {
        MyNormalInterface normalInterface = new NormalInterfaceImpl();
        normalInterface.methodOne();
        normalInterface.methodTwo();
    }
}
