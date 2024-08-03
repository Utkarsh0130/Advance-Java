// This program demonstrates the use of annotations in Java

import java.lang.annotation.*;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

class AnnotatedClass {
    @MyAnnotation(value = "Custom Annotation Example")
    public void annotatedMethod() {
        System.out.println("This method is annotated.");
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        AnnotatedClass obj = new AnnotatedClass();
        obj.annotatedMethod();
        
        // Accessing the annotation
        try {
            Method method = obj.getClass().getMethod("annotatedMethod");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
