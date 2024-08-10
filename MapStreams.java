import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapStreams {
    public static void main(String[] args) {
        Map<String, Integer> empMap = new HashMap<>();
        empMap.put("gogi", 100);
        empMap.put("mark", 500);
        empMap.put("dave", 200);
        empMap.put("don", 300);

        //filter with key mark

        Map<String, Integer> myMap = empMap.entrySet().stream().filter(entry -> entry.getKey().equals("mark")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(myMap);


        int[] a1 = {2,5,5,7,1,3,3,5,8,9};

        int[] b1 = {2,3,7,8,9,2,3,3,2};

        HashSet<Integer> s1 = (HashSet<Integer>) Arrays.stream(a1).boxed().collect(Collectors.toSet());
        System.out.println(s1);

        //find the missing number in b1
      
    
        }
    
}
