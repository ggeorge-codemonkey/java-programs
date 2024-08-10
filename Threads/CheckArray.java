import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckArray {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,2,3,5,6,8};
        int[] arr2 = {5,6,7,4,5,3,2,1};

        //check if arr1 contains all the values in arr2.

       Set<Integer> hSet = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
       int[] result = Arrays.stream(arr2).distinct().filter(val -> !hSet.contains(val)).toArray();
       System.out.println(result);
       Arrays.stream(result).forEach(System.out::println);
    }
}
