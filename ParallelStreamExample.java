
// This program demonstrates the use of Parallel Streams in Java

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("parallel", "stream", "example", "in", "java");
        
        // Using parallelStream to process elements in parallel
        System.out.println("Using parallel stream:");
        words.parallelStream()
             .map(String::toUpperCase)
             .forEach(word -> System.out.println(Thread.currentThread().getName() + ": " + word));
        
        // Using normal stream to process elements sequentially
        System.out.println("Using sequential stream:");
        words.stream()
             .map(String::toUpperCase)
             .forEach(word -> System.out.println(Thread.currentThread().getName() + ": " + word));
    }
}
