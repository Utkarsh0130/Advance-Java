class OuterClass {
    private String message = "Hello from Outer Class!";

    // Inner class
    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }

    void createInnerInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerInstance();
    }
}
