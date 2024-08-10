import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test123 {
    public static void main(String[] args) {
        String input = "India is the capital of the world";
        String reversed = reverseStringUsingStreams(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseStringUsingStreams(String input) {
        return IntStream.rangeClosed(1, input.length())
                .mapToObj(i -> input.charAt(input.length() - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static String reverseString(String input){

      return  IntStream.rangeClosed(0, input.length())
        .mapToObj(i -> input.charAt(input.length() -1))
        .map(String::valueOf)
        .collect(Collectors.joining());
    }
}
