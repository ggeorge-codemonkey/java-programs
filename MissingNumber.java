import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 5, 7, 8};
        int[] b = {2, 6, 7, 5, 3};
        //convert array b to a set for quick lookup
        Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());

        List<Integer> missingNumbers = Arrays.stream(a).boxed().filter(n -> !bSet.contains(n)).toList();

        Arrays.stream(a).boxed().filter(n -> !bSet.contains(n)).toList().forEach(System.out::println);

        
    }
}



