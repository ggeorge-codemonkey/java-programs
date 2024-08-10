import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindSingleNum {
    public static void main(String[] args) {
        //Given an array of numbers, find the number that only occurs once. For example, if you were given the array [1,1,2,3,3], return 2.

        int[] arr = {1,1,2,3,3};

        Map<Integer, Integer> countMap =  new HashMap<>();
        countMap.put(1, 1);
        countMap.put(1, 2);
        System.out.println(countMap);


        int[] arr1 = {1,5,4,3,2,8,6, 10} ;

       int[] result = Arrays.stream(arr1).filter(n -> n%2 ==0).toArray();
       Arrays.stream(result).forEach(System.out::println);
    }
}
