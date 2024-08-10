import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaParallelStreams {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Process the list using a parallel stream
        List<Integer> squaredNumbers = numbers.parallelStream()
                                              .map(number -> {
                                                  System.out.println("Processing " + number + " in thread " + Thread.currentThread().getName());
                                                  return number * number;
                                              })
                                              .collect(Collectors.toList());

        // Print the result
        System.out.println("Squared Numbers: " + squaredNumbers);


        List<Integer> squaredNumbers1 = numbers.stream()
    .map(number -> {
        System.out.println("Processing " + number + " in thread " + Thread.currentThread().getName());
        return number * number;
    })
    .collect(Collectors.toList());

    int processors = Runtime.getRuntime().availableProcessors();
    System.out.println(processors);
    }

    

    
}

