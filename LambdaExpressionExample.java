// This program demonstrates the use of lambda expressions in Java

@FunctionalInterface
interface MyFunctionalInterface {
    void display(String message);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // Using lambda expression
        MyFunctionalInterface lambda = (message) -> System.out.println("Message: " + message);
        lambda.display("Hello, Lambda Expressions!");
    }
}
